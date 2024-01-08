package com.arrays;

public class Rotating2DArray90deg {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int j=0;
		int k= 2;
		
		while(j<=k) {
			int a1[] = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                a1[i] = arr[i][j];
            }
            
            for (int i = 0; i < arr.length; i++) {
                arr[i][j] = a1[i];
            }
            j++;
		}
		
		for (int i = 0; i < arr.length; i++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.print(arr[i][col] + " ");
            }
            System.out.println();
        }

	}

}
