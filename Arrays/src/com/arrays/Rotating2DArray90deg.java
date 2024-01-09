package com.arrays;

public class Rotating2DArray90deg {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			int start1 =0;
			int end1 = arr.length-1;
			 while (start1 < end1) {
	                // Swap elements at start and end indices in the current row
	                int temp = arr[i][start1];
	                arr[i][start1] = arr[i][end1];
	                arr[i][end1] = temp;
	                start1++;
	                end1--;
	            }
		}
		
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	}
}
