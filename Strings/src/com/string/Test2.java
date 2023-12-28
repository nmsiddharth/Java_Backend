package com.string;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java";
		String str1 = "Java";
		if(str==str1) {
			System.out.println("Both point to same object");
		}else {
			System.out.println("Both point to different object");
		}
		
		//////////////////////
		String data = "Siddharth";
		System.out.println(data.substring(1,4));
		String data2 = "Siddharth learns java";
		String []arr = (data2.split(" "));
		for(String ele:arr) {
			System.out.println(ele);
		}
		
		///////////////////
		System.out.println(str.equals(str1)); 

	}

}
