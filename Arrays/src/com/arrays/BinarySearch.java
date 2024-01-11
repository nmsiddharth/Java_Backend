package com.arrays;

public class BinarySearch {

	public static int check() {
		int arr[] = {1,3,5,7,9};
		int target = 9;
		int low = arr[0];
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+ (high-low)/2);
			
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				low = mid+1;
				
			}else {
				high = mid-1;
				
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check());
	}

}
