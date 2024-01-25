package com.Lambda_Expression;

interface Data{
	void m1();
}

class A{
	public void m2() {
		System.out.println("Method implementation");
	}
	
	public static void m3() {
		System.out.println("Another method implementation");
	}
}
public class Method_References {

	public static void main(String[] args) {
		A obj = new A();
		//Data data = obj::m2;   // normal method
		Data data = A::m3;   // static method
		data.m1();

	}

}
