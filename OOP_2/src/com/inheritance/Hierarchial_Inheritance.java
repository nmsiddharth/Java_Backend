package com.inheritance;

class Vehicle1{
	String engineType = "Petrol";
}

class TwoWheeler extends Vehicle1{
	int numWheels = 2;
}

class FourWheeler extends Vehicle1{
	int numWheels = 4;
}
public class Hierarchial_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler two = new TwoWheeler();
		System.out.println(two.engineType+" "+two.numWheels);
		
		FourWheeler four = new FourWheeler();
		System.out.println(four.engineType+" "+four.numWheels);

	}

}
