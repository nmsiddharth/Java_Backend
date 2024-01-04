package com.arrays;

public class Sorting0and1WithoutSortingTechnique {

	public static int getCount(int [] arr) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		return count;
	}
	
	public static int[] check(int[] arr){
		int temp = getCount(arr);
		for(int i=0;i<arr.length;i++) {
			if(i==(temp))break;
			arr[i]=0;
			
	}
		for(int i=temp;i<arr.length;i++) {
			arr[i]=1;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,0,0,1,1,1,0,1};
		int [] array = check(arr);
		for(int data:array) {
			System.out.print(data);
		}
		//System.out.println(Sorting0and1WithoutSortingTechnique.getCount(arr));
		
	}

}
