package com.threading;

public class Start_Method_Twice extends Thread {

	public void run() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start_Method_Twice obj = new Start_Method_Twice();
		obj.start();
		obj.start();

	}

}
