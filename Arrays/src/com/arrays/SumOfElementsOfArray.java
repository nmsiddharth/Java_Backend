package com.arrays;

import java.util.Scanner;

public class SumOfElementsOfArray {

	public static int check() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int [] arr1 = new int[size]; 
		
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			arr1[i] = sc.nextInt();
			sum = sum + arr1[i];
		}
		return sum;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumOfElementsOfArray.check());
		
		

	}

}
