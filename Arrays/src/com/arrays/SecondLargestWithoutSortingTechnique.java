package com.arrays;

public class SecondLargestWithoutSortingTechnique {

	public static void check() {
		int[] arr = {4,8,6,12,4,2};
		
		int largest = arr[arr.length-1];
		
		for(int data:arr) {
			if(largest<data) {
				largest = data;
			}
		}
		//System.out.println(largest);
		
		int secondLargest = arr[arr.length-1];
		
		for(int i=arr.length-2;i>=0;i--) {
			if(largest>arr[i] && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		System.out.println(secondLargest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
