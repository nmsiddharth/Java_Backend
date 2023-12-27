package com.if_else;

import java.util.Scanner;

class DB{
	private static final String userName = "admin";
	private static final String password = "admin";
	
	public static String getUserName() {
		return DB.userName;
	}
	
	public static String getPassword() {
		return DB.password;
	}
	
}

class UserAuthentication{
	public boolean VerifyUser() {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserName");
		String username = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		
		if(username.equals(DB.getUserName())&& password.equals(DB.getPassword())) {
			flag = true;
		}
		return flag;
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAuthentication user = new UserAuthentication();
		boolean result = user.VerifyUser();
		if(result) {
			System.out.println("Verified user");
		}
		else {
			System.out.println("Invalid username or password");
		}
	}

}
