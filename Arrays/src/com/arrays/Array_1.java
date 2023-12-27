package com.arrays;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] ar = {1,2,3,4,5};
		
		
		// Reading size of an array from console
		Scanner sc = new Scanner(System.in);
		System.out.println("Entr a size of an array");
		int size = sc.nextInt();
		int [] arr1 = new int[size];
		
		// To enter elements 
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			arr1[i]= sc.nextInt();
		}
		
		// To read an array
		for(int i=0;i<size;i++) {
			System.out.println(arr1[i] + " ");
		}
		
	}

}
