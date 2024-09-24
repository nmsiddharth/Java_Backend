package com.switchStatements;

import java.util.Scanner;

public class SwitchStatements {
	public static void getfactorial(Scanner sc) {
		int fact = 1;
		System.out.println("Enter the Number to get factorial");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	
	public static void getPower(Scanner sc) {
		int result = 1;
		System.out.println("Enter the Base Number");
		int base = sc.nextInt();
		System.out.println("Enter the value of Power");
		int power = sc.nextInt();
		
		for(int i=1;i<=power;i++) {
			result = result*base;
		}
		System.out.println(result);
	}
	
	public static void getMultiple(Scanner sc) {
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num + "x" + i+ " ="+ (num*i));
		}
	}
	
	public static void getPrime(Scanner sc) {
		boolean flag = true;
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
			flag = false;
			break;
			}
		}
		if(flag) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Select to perform operations");
			System.out.println("Press 1.(Factorial)  2.(Power)  3.(PrintTable)  4.(prime/Not a Prime)");
			
			int choose = sc.nextInt();	
			switch(choose) {
			case 1: getfactorial(sc);
					break;
			case 2: getPower(sc);
					break;
			case 3: getMultiple(sc);
			        break;
			case 4: getPrime(sc);
	        		break;	        
			default: System.out.println("Incorrect option selected");
			}
			System.out.println("Do you want to continue:y/n");
			ch = sc.next().charAt(0);
		}while(ch=='y');
			System.out.println("Thank You");
	}

}
