package com.exceptionHandling;

public class Test_1 {

	public static void m1() {
		try {
			//int result = 12/0;
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException ae){
			System.out.println("Exception handled");
		}
		System.out.println("Hello");
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
 