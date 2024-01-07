package com.inheritance;

class Vehicle{
	String engineType = "Petrol";
}

class Fourwheel extends Vehicle{
	int numWheels = 4;
}

class Car extends Fourwheel{
	String name = "Urus";
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.name);
		System.out.println(obj.numWheels);
		System.out.println(obj.engineType);
	}

}
