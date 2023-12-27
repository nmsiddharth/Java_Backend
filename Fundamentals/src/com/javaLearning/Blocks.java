package com.javaLearning;

class Java{
	// static block
	static {
		System.out.println("Static block is executed");
	}
	
	// instance initialisation block
	{
		System.out.println("IIB is executed");
	}
}

public class Blocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java obj1 = new Java();
		Java obj2 = new Java();
		Java obj3 = new Java();

	}

}
