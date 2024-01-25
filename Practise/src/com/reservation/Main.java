package com.reservation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking book = new Booking();
		User u1 = new User("SId",6,book);
		User u2 = new User("Virat",2,book);
		u1.start();
		
		u2.start();
		
		

	}

}
