package com.threading;

class A1 extends Thread{
	public void printFive() {
		for(int i=1;i<=10;i++) {
			System.out.println(5+"x"+i+" = "+ 5*i );
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void run() {
		printFive();
	}
}

class B extends Thread{
	public void printFive() {
		for(int i=1;i<=10;i++) {
			System.out.println(10+"x"+i+" = "+ 10*i );
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void run() {
		printFive();
	}
}
public class MultipleThreadsUsingJoinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		B b = new B();
		
		a.start();
		
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		b.start();

	}

}
