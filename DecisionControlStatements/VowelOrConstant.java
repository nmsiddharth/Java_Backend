package com.Set_5;

public class VowelOrConstant {

	public static String check(char ch) {
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return "Character is Vowel";
		}else {
			return "Character is Consonant";
		}
	}
	public static void main(String[] args) {
		char ch = 'f';
		System.out.println(check(ch));

	}

}
