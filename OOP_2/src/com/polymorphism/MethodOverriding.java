package com.polymorphism;

class Parent{
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}

class Child extends Parent{
	@Override	
	public void add(int a, int b) {
		String str = String.valueOf(a);
		String str1 = String.valueOf(b);
		System.out.println(str+str1);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
//		Parent pa = new Parent();
//		pa.add(4,5);
		
		Child ch = new Child();
		ch.add(5,4);
		
	}

}
