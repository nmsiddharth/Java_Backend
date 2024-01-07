package com.inheritance;


	class Parent {
		int a = 10;
		public int b = 20;
		protected int c = 30;
		private int d = 40;
	}
	
	class Child extends Parent{
		int x = 100;
		
	}
	
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		//System.out.println(obj.d);
		System.out.println(obj.x);
		
		System.out.println("------------------------------------------");
		Parent obj2 =new Parent();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		//System.out.println(obj2.d);
		//System.out.println(obj2.x);
		

	}

}
