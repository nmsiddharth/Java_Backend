package com.Abstraction;

@FunctionalInterface
interface ABC{
	void m1();
	//void m2();
}
public class Interface_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC a = ()->{System.out.println("Hello");};
		a.m1();
	}

}
