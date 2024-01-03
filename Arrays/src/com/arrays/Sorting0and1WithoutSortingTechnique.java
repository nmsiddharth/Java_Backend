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
		int[] arr2 = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr2[i]=0;
			}else {
				arr2[temp++]=1;
			}
		}
		
		return arr2;
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
