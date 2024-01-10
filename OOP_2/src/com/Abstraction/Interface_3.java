package com.Abstraction;

interface Computer{
	public static void m1() {
		System.out.println("static methods");
	}
	public default void m2() {
		System.out.println("default method from interface");
		
	}
}

class Laptop implements Computer{
	
}
public class Interface_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer.m1();
		Computer obj = new Laptop();
		obj.m2();

	}

}
