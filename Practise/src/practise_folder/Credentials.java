package practise_folder;

import java.util.Scanner;

class DB{
	private static final String userName = "Siddharth";
	private static final String password = "rocky";
	
	public static String getUserName() {
		return DB.userName;
	}
	
	public static String getPassword() {
		return DB.password;
	}
}

class Authentication{
	public String login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName");
		String userName = sc.next();
		
		if(userName.equals(DB.getUserName())) {
			System.out.println("Valid userName entered");
			System.out.println("Enter password");
			String password = sc.next();
			if(password.equals(DB.getPassword())) {
				   return "Credentials verified"; // Login successful
            } else {
                return "Enter valid password";
            }
        } else {
            return "Enter valid userName";
		}
	}
}
public class Credentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Authentication obj = new Authentication();
		String result = obj.login();
		System.out.println(result);

	}

}
