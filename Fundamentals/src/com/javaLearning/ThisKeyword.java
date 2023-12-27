package com.javaLearning;

class Car{
	Car(){
		System.out.println("Current value of this keyword = "+ this.hashCode());
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Car c1 = new Car();
		System.out.println(c1.hashCode());
		
		Car c2 = new Car();
		System.out.println(c2.hashCode());
	}

}
