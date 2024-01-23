package com.arrays;

public class SortingWithoutUsingSortingTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,9,10,3,2};
		
		int small = arr[0];
		
		for(int data:arr) {
			if(small>data) {
				small=data;
			}
		}
		int secondSmall = arr[0];
		for(int i=1;i<arr.length-1;i++) {
			if(secondSmall>arr[i] && arr[i]>small) {
				secondSmall = arr[i];
			}
		}
		System.out.println(secondSmall);
		

	}

}
