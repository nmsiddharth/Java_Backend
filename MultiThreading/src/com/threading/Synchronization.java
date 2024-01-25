package com.threading;

class Table_data{
	public synchronized void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+
					" "+num+" * "+i+" = "+(num*i));	
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class X1 extends Thread{
	private Table_data obj;
	X1(Table_data obj){
		this.obj = obj;
	}
	
	public void run(){
		obj.printTable(5);
	}
}

class Y1 extends Thread{
	private Table_data obj;
	Y1(Table_data obj){
		this.obj = obj;
	}
	
	public void run(){
		obj.printTable(10);
	}
}


public class Synchronization {

	public static void main(String[] args) {
		Table_data table = new Table_data();
		X1 x = new X1(table);
		Y1 y = new Y1(table);
		
		x.setName("Thread A:");
		y.setName("Thread B:");
		
		x.start();
		y.start();

	}

}