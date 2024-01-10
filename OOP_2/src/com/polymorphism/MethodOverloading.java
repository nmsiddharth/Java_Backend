package com.polymorphism;

class Dimension{
	public void area(float radius) {
		System.out.println("Area of cirlce "+Math.PI*radius*radius);
	}
	
	public void area(int side) {
		System.out.println("Area of square "+(side*side));
	}
	
	public void area(int length,int breadth) {
		System.out.println("Area of rectangle "+(length*breadth));
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension obj = new Dimension();
		obj.area(12);
		obj.area(12.5f);
		obj.area(12,15);

	}

}
