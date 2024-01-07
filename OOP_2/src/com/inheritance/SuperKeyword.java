package com.inheritance;

	class Base{
		public void m1() {
			System.out.println("Hello from Base class");
		}
	}
	
	class Derived extends Base{
		public void m1() {
			System.out.println("Hello from Derived class");
		}
		public void m2() {
			System.out.println("m2() is executing");
			this.m1();    // refers to current object execution
			super.m1();	 // refers to Parent class object 
		}
	}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived obj = new Derived();
		obj.m2();

	}

}
