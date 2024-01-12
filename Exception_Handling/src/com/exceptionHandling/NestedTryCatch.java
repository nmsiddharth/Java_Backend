package com.exceptionHandling;

public class NestedTryCatch {

	public static void m1() {
		try {
			String str = null;
			System.out.println(str.length());
			try {
				int result = 12/0;
				System.out.println(result);
			}catch(ArithmeticException ae) {
				System.out.println("Exception handled in 1st catch block");
			}
			
		}catch(Exception e) {
			System.out.println("Exeption handked in 2nd catch block");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
