package com.exceptionHandling;

public class FinallyBlock {

	public static void m1() {
		try {
			System.out.println(12/4);
			int i = 12/0;
			System.out.println(i);
		}catch(NullPointerException e) {
			System.out.println("Exception handled");
		}finally {				// finally block is executed even exception is handled or not
			System.out.println("Finally block executed..");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
														
	}

}
