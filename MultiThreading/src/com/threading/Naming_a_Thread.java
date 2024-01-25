package com.threading;

public class Naming_a_Thread extends Thread{

	public void run() {
		System.out.println("Current Thread : "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Naming_a_Thread t1 = new Naming_a_Thread();
		t1.setName("Siddu");
		t1.start();

	}

}
