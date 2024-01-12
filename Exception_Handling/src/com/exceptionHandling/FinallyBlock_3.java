package com.exceptionHandling;

public class FinallyBlock_3 {

	public static int m1() {
		try {
			//int a  =12/2;
			int a = 12/0;
			return a;
		}catch(Exception e) {
			return -1;
		}finally {
			System.out.println("Finally executed");;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m1());
	}

}
