package com.exceptionHandling;

public class NestedTryCatch_3 {


	public static void m1() {
		try {
			String str = "Java";
			System.out.println(str.length());
			try {
				String result = null;
				System.out.println(result.charAt(2));
			}catch(ArithmeticException ae) {
				System.out.println("Exception handled in 1st catch block");
			}
			
		}catch(Exception e) {
			System.out.println("Exeption handked in 2nd catch block");
		}
	}
	public static void main(String[] args) {
		m1();
	}

}
