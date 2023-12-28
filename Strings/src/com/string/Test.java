package com.string;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		System.out.println("Before Update");
		System.out.println(str);
		str.concat("world");
		System.out.println("After update");
		System.out.println(str);
		
		str = str.concat("Code");
		System.out.println(str);  
		
	}

}
