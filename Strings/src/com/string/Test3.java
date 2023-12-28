package com.string;

public class Test3 {
	
	public static void reverse(String str) {
		String[] newString = str.split(" ");
		for(int i=newString.length-1;i>=0;i--) {
			System.out.print(newString[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is a Programming language";
		reverse(str);
		
	}

}
