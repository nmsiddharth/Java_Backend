package com.learning.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.SpringBoot.entity.User;
import com.learning.SpringBoot.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return this.userRepository.getAll();
	}
	
	public User getUserByid(int id) {
		return this.userRepository.getUserById(id);
	}
	
	public User addNewUser(User newUser) {
		return this.userRepository.addUser(newUser);
	}
	
	public String updateUser(int id, User user) {
		return this.userRepository.updateUser(id, user);
	}
	
	public String deleteUser(int id) {
		return this.userRepository.deleteUser(id);
	}
}
