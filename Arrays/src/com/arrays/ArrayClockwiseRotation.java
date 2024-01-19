 package com.arrays;

import java.util.Arrays;

public class ArrayClockwiseRotation {

	public static int[] check(int[] arr) {
		int k=3;
		int j=1;
		while(j<=k) {
			int temp = arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
			j++;
		}
		
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
//		int []array=check(arr);
//		for(int data:array) {
//			System.out.print(data+" ");
//		}
		
		System.out.println(Arrays.toString(check(arr)));
	

	}

}
