package com.threading;

class MyThread extends Thread{
	public void print() {
		System.out.println("Print() method is executed by = "+Thread.currentThread().getName());
	}
	public void run() {
		print();
	}
}
public class Creating_a_thread {

	public static void main(String[] args) {
		System.out.println("Current thread = "+Thread.currentThread().getName());
		
		MyThread t1 = new MyThread();
		t1.start();

	}

}
