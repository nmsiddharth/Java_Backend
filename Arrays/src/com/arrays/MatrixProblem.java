package com.arrays;

import java.util.Scanner;

public class MatrixProblem {

	public static void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of Columns");
		int cols = sc.nextInt();
		int [][] arr = new int[rows][cols]; 
		System.out.println("Enter the Elements");
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Displaying Elements :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the Row value");
		int x = sc.nextInt();
		System.out.println("Enter the Col value");
		int y = sc.nextInt();
		
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(i==x || j==y) {
					arr[i][j]=0;
				}
			}
		}
		
		System.out.println("Displaying Elements :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MatrixProblem.check();

	}

}
