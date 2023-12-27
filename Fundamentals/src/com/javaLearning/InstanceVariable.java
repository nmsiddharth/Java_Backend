package com.javaLearning;

public class InstanceVariable {
	
	int a = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable s1 = new InstanceVariable();
		InstanceVariable s2 = new InstanceVariable();
		System.out.println(s1.a);
		System.out.println(s2.a);
		
		s1.a = 300;
		System.out.println("After modification : ");
		System.out.println(s1.a);
		System.out.println(s2.a);  

	}

}
