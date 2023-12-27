package com.javaLearning;

public class Operators {
	int a = 10;
	int b = 5;
	boolean c = true;
	
	public void arithmatic() {
		System.out.println("Addition : "+(this.a+this.b));
		System.out.println("Subtraction : "+(this.a-this.b));
		System.out.println("Multiplication : "+(this.a*this.b));
		System.out.println("Division : "+(this.a/this.b));
		System.out.println("Modulus : "+(this.a%this.b));
		System.out.println("--------------------");
	}
	

	public void unary() {
		System.out.println("Minus : "+ (-this.a));
		System.out.println("Not : "+ !(this.c));
		int data = a++;
		System.out.println("Increment : "+data + " " + this.a);
		int data2 = ++b;
		System.out.println("Increment : "+data2 + " " + this.b);
		System.out.println("--------------------");
	}
	
	public void relational() {
		System.out.println("a : "+ (this.a));
		System.out.println("b : "+ (this.b));
		System.out.println("Equal : "+ (this.a==this.b));
		System.out.println("Not Equal : "+ (this.a!=this.b));
		System.out.println("Greater Than : "+ (this.a>this.b));
		System.out.println("Lesser Than : "+ (this.a<this.b));
		System.out.println("Greater Than/Equals : "+ (this.a>=this.b));
		System.out.println("Lesser Than/Equals : "+ (this.a<=this.b));
		System.out.println("--------------------");
	}
	
	public void ternary() {
		// Syntax :
	//	           condition ? res1(if true) : res2(if false);
		
		System.out.println("Ternary : "+(this.a>this.b ? "Java" : "Python"));
		System.out.println("--------------------");
	}
	
	public void logical() {
		System.out.println("AND : "+ ((this.a==this.b) && (this.a>this.b))) ;
		System.out.println("OR : "+ ((this.a==this.b) || (this.a>this.b))) ;
		System.out.println("Not : "+ !(!(this.a==this.b) && (this.a>this.b))) ;
		System.out.println("--------------------");
	}
	
	public void bitwise() {
		int num1 = 8; // 1000
		int num2 = 4; // 0100
		
		System.out.println("Bitwise AND : "+(num1 & num2));  
		System.out.println("Bitwise OR : "+(num1 | num2));	
		System.out.println("Bitwise XOR : "+(num1 ^   num2));
		System.out.println("Compliment Operator : "+(~num1));
		System.out.println("--------------------");
	}
	
	public void shift() {
		int num = 5;
		System.out.println("Left Shift : "+ (num<<2));
		System.out.println("Right Shift : "+ (num>>2));
	}
	
	public void instance() {
		String str = "Java";
		System.out.println(str instanceof String);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operators obj = new Operators();
		obj.arithmatic();
		obj.unary();
		obj.relational();
		obj.ternary();
		obj.logical();
		obj.bitwise();
		obj.shift();
		obj.instance();
	}

}
