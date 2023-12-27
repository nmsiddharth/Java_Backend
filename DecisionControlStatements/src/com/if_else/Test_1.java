package com.if_else;

public class Test_1 {
	
	public void checkPositiveNumber(int number) {
		if(number>0) {
			System.out.println("Positive Number....");
		}else {
			System.out.println("Negative Number...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_1 t = new Test_1();
		t.checkPositiveNumber(-12);

	}

}
