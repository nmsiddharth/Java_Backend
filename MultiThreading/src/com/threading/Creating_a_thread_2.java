package com.threading;

class MyThread_2 implements Runnable{
	public void print() {
		System.out.println("Print() method is executed by = "+Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		print();
	}
}
public class Creating_a_thread_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread_2 t1 = new MyThread_2();
		Thread th = new Thread(t1);
		th.start();

	}

}
