package com.javaLearning;

class Vehicle{
	Vehicle(){
		
		System.out.println("Default constructor");

	}
	
	Vehicle(int a){
		this();
		System.out.println("Parameterized constructor");
	}
}

public class UseOfThis_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle(10);

	}

}
