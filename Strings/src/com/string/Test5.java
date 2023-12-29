package com.string;

public class Test5 {

	public static void check(String str) {
		for(int i=0;i<str.length();i++) {
			int currrentIndex = str.indexOf(str.charAt(i));
			int LastIndex = str.lastIndexOf(str.charAt(i));
			if(currrentIndex==LastIndex) {
				System.out.println(str.charAt(i));
				break;   // If we remove break , then it prints all non-repeating characters.  
			}
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hehllo";
		check(str);

	}
 
}
