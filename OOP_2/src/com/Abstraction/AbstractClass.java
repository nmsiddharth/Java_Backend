package com.Abstraction;

abstract class Account{
	public abstract void salary();   // abstract method
	public void m1() {
		
	};
	public static void m2() {
		
	}
}

class FTEAccount extends Account{

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FTEAccount obj = new FTEAccount();
		obj.m1();
		obj.salary();
		Account.m2();

	}

}
