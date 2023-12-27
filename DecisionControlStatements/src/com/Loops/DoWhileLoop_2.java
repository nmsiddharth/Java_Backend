package com.Loops;

import java.util.Scanner;

public class DoWhileLoop_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int choose;
		do {
			System.out.println("Enter the Number");
			int num = sc.nextInt();
			if(num!=0) {
				sum = sum+num;
			}
			System.out.println("Do you want to containue again? y/n (1:0)");
			choose = sc.nextInt();
		}while(choose!=0);
		System.out.println(sum);
		
	}

}
