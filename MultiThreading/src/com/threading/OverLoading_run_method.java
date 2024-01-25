package com.threading;

class ThreadA extends Thread{
	public void run(int a) {
		System.out.println("Current Thread : "+Thread.currentThread().getName());
	}
}
public class OverLoading_run_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA th = new ThreadA();
		th.start();

	}

}
