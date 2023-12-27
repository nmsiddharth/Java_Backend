package com.arrays;

public class SumOfEvenNumberInArray {

	public static int getEven(int []arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum = sum+arr[i];
			}
		}
		return sum;
	}
	
	public static int findElement(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				return i;
			}
			
		}
		return -1;
	}
	
	public static int peakkElement(int[] arr2) {
		int temp = 0;
		for(int i=1;i<=arr2.length-1;i++) {
			if(arr2[i]>arr2[i-1] && arr2[i]>arr2[i+1]) {
				temp = arr2[i];
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		int [] arr2 = {5,10,20,15};
		int key = 12; 
		int result = getEven(arr);
		System.out.println(result);
		int result1 = findElement(arr,key);
		System.out.println(result1);
		int result2 = peakkElement(arr2);
		System.out.println(result2);

	}

}
