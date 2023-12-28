 package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class  SecondLargestElement {
	public static int check(int[] arr) {
		
//		for(int l=0;l<arr.length;l++) {
//			for(int j=l+1;j<arr.length;j++) {
//				if(arr[l]>arr[j]) {
//					int temp = arr[j];
//					arr[l]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		Arrays.sort(arr);
		
		for(int data:arr) {
		System.out.print(data+" ");
		}
		
		return arr[arr.length-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {12,23,22,25,35};
		int count = SecondLargestElement.check(arr);
		System.out.println();
		System.out.println(count);
		
		
	}

}
