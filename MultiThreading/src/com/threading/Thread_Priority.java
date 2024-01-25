package com.threading;

public class Thread_Priority extends Thread{

	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Current Thread : "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getPriority());
		
		Thread_Priority t1 = new Thread_Priority();
		Thread_Priority t2 = new Thread_Priority();
		Thread_Priority t3 = new Thread_Priority();
		
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
//		System.out.println(t3.getPriority());
//		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.setPriority(MIN_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
