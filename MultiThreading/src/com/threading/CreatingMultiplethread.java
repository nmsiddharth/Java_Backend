package com.threading;

class Task extends Thread{
	public void run() {
		print();
	}
	public void print() {
		for(int i=1;i<=5;i++) {
			System.out.println("Current Thread : "+Thread.currentThread().getName()+"->"+i);
		}
	}
}

public class CreatingMultiplethread {

	public static void main(String[] args) {
		Task t1 = new Task();
		Task t2 = new Task();
		
		t1.start();
		t2.start();

	}

}