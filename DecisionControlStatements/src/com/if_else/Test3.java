package com.if_else;

import java.util.Scanner;

class DB1{
	private static final String userName = "admin";
	private static final String password = "admin";
	
	public static String getUserName() {
		return DB1.userName;
	}
	
	public static String getPassword() {
		return DB1.password;
	}
	
}

class UserAuthentication1{
	public boolean VerifyUser() {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserName");
		String username = sc.next();
		
		if(username.equals(DB1.getUserName())) {
			System.out.println("Enter the password");
			String password = sc.next();
			if(password.equals(DB1.getPassword())) {
				flag = true;
		}
  } 
	  return flag;
	
	 

 }
	
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAuthentication1 user = new UserAuthentication1();
		boolean result = user.VerifyUser();
		if(result) {
			System.out.println("Verified user");
		}
		else {
			System.out.println("Invalid username or password");
		}
	}

}
