package com.javaLearning;

public class Function2 {
	int data = 100;
	static int data2 = 200;
	
	public void fn1() {
		System.out.println(data);
		System.out.println(data2);
	}
	
	public static void fn2() {
		  System.out.println(data2);
		}
	public static void main(String[] args) {
		Function2 obj = new Function2();
		obj.fn1();
		Function2.fn2();
	}

}
