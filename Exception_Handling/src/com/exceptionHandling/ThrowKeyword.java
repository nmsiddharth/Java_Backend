package com.exceptionHandling;

public class ThrowKeyword {

	public static void m1(int num) {
		if(num<18) {
			throw new ArithmeticException();
		}else {
			System.out.println("Welcome to Vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(17);

	}

}
