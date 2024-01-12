package com.exceptionHandling;

public class FinallyBlock_2 {

	public static int m1() {
		try {
			int a  =12/2;
			return a;
		}catch(Exception e) {
			return -1;
		}finally {
			return 2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}

}
