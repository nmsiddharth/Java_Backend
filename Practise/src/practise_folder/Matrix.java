package practise_folder;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int row = sc.nextInt();
		System.out.println("Enter the col size");
		int col = sc.nextInt();
		int [][] arr = new int[row][col];
		System.out.println("Enter the elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
