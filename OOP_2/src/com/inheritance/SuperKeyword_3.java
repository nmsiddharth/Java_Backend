package com.inheritance;

class Super{
	Super(){
		System.out.println("Constructor from super class");
	}
}

class Sub extends Super{
	Sub(){
		this(5);
		System.out.println("Constructor from sub class");
	}
	Sub(int a){
		super();
		System.out.println("Parameterized Constructor");
	}
}
public class SuperKeyword_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub obj = new Sub();
		
		

	}

}
