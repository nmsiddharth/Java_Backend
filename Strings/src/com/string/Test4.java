package com.string;

public class Test4 {

	public static void reverse(String str) {
		String [] newStr = str.split(" ");
		for(String ele:newStr) {
			char ch[] = ele.toCharArray();
			for(int i=ch.length-1;i>=0;i--) {
				System.out.print(ch[i]);
			}
			System.out.print(" ");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is a Programming language";
		reverse(str);
	}

}
