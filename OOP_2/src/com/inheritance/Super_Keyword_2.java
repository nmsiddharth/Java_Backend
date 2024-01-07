package com.inheritance;

class A{
	int a = 100;
}

class B extends A{
	int a = 200;
	
	public void show() {
		int a = 300;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
public class Super_Keyword_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.show();

	}

}
