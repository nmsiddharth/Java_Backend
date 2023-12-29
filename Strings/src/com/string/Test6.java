package com.string;

import java.util.Arrays;

public class Test6 {

	public static void check(String [] arr) {
		String temp = "";
		for(int i=0;i<arr.length;i++) {
			temp = arr[i].substring(i, i+1);
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"abc", "abdef", "abcdefgh"};
		check(arr);
	}

}
