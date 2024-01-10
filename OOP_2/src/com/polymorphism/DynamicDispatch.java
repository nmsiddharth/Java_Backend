package com.polymorphism;

class Superclass{
	int a =10;
	
	public void m1() {
		System.out.println("Parent class");
	}
}
class Subclass extends Superclass{
	int a =20;
	
	@Override
	public void m1() {
		System.out.println("Child class");
	}
}
public class DynamicDispatch {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superclass ref = new Subclass();
		System.out.println(ref.a);
		ref.m1();
	}

}
