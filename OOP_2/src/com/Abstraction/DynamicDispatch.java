package com.Abstraction;

abstract class Car{
	public abstract void getName();
}
class Maruti extends Car {
	public void getName() {
		System.out.println("Maruti series");
	}
}
class Honda extends Car{
	public void getName() {
		System.out.println("Honda series");
	}
}

public class DynamicDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Maruti();
		obj.getName();

	}

}
