package com.threading;

class A extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class Join_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread started");
		A a = new A();
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread completed");

	}

}
