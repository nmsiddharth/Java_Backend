package com.javaLearning;

public class Function1 {

	public void siddu(){
		System.out.println("Hi! Macha");
	}
	
	public int siddharth() {
		return 100;
	}
	
	public String sid(String name) {
		return "Hi! "+name+ " changidya";
	}
	
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function1 obj = new Function1();
		obj.siddu();
		
		 int result = obj.siddharth();
		 System.out.println(result);
		 
		 String output = obj.sid("Siddharth");
		 System.out.println(output);
		 
		 boolean out = obj.isEven(20);
		 System.out.println(out);

	}

}
