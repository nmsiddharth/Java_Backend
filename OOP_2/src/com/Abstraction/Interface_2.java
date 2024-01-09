package com.Abstraction;

interface A1{
	int data = 200;
}
public class Interface_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A1.data);
		//A1.data = 500;  // since data variable is by default FINAL in Interface
	}

}
