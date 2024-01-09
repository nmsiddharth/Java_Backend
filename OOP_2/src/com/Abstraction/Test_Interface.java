package com.Abstraction;

interface A{
	void m1();
}

interface C extends A{
	void m2();
}
class D{
	public void m3() {
		System.out.println("Hello from class D");
	}
}
class B extends D implements A,C{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hello from interface A");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Hello from interface C");
		
	}
	
}
public class Test_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
