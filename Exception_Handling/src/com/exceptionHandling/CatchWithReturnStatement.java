package com.exceptionHandling;

public class CatchWithReturnStatement {

	public static int m1() {
		try {
			int i = 12/0;
			System.out.println(i);
		}catch(Exception e) {
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}

}
