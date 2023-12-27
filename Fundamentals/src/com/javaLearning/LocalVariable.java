package com.javaLearning;

public class LocalVariable {
	public void show() {
		int data = 100;
		System.out.println(data);
	}
	public int display() {
		int data2 = 200;
		return data2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable obj = new LocalVariable();
		obj.show();
		
		int result = obj.display();
		System.out.println(result);

	}

}
