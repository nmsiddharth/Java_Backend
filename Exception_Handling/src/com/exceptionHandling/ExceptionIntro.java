package com.exceptionHandling;

public class ExceptionIntro {

	
	public static void main(String[] args) {
	
		int arr[] = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = i*i;
		}
		
		for(int data: arr) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		System.out.println("End of Array");

	}

}
