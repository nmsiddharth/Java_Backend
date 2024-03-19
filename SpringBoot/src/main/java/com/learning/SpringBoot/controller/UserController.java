package com.learning.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.SpringBoot.entity.User;
import com.learning.SpringBoot.service.UserService;

@RestController   // handles requests made by the class
@RequestMapping("/user/api")    // used to map the web requests
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUser(){
		List<User> users = this.userService.getAllUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id){
		User user = this.userService.getUserByid(id);
		return new ResponseEntity<User>(user,HttpStatus.FOUND);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(this.userService.addNewUser(user),HttpStatus.CREATED);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<String> updateUser(@PathVariable int id,@RequestBody User user){
		return new ResponseEntity<>(this.userService.updateUser(id,user),HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id){
		return new ResponseEntity<>(this.userService.deleteUser(id),HttpStatus.OK);
	}
}
