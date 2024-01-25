package com.threading;

class Account{
	public  int amount = 1000;
	public synchronized void withdraw() {
		int withdrawAmount = 1500;
		if(this.amount<withdrawAmount) {
			System.out.println("Insufficient amount....Waiting for deposit");
			try {
				wait(); // Friend1 needs to release the lock
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("Amount withdrawn successfully");
		
		
}
	public synchronized void deposit() {
		this.amount = this.amount + 1500;
		System.out.println("Amount deposited successfully");
		notifyAll();
	}
}
	
class Friend1 extends Thread{
	private Account account;
	
	Friend1(Account account){
		this.account = account;
	}
	public void run() {
		this.account.withdraw();
	}
	
	
	}


class Friend2 extends Thread{
private Account account;
	
	Friend2(Account account){
		this.account = account;
	}
	public void run() {
		this.account.deposit();
	}
	
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Friend1 f = new Friend1(account);
		Friend2 f1 = new Friend2(account);
		
		f.start();
		f1.start();
	}

}
