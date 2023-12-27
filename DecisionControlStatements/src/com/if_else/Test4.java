package com.if_else;

import java.util.Scanner;

class Marks{
	
	public String score() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks = sc.nextInt();
		
		if(marks>=80) {
			return "Distinction";
		}else if(marks<80 && marks>=60) {
			return "First Class";
		}else if(marks<60 && marks>=35) {
			return "Second Class";
		}
			return "Try again";
		
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks obj = new Marks();
		String result = obj.score();
		System.out.println(result);

	}

}
