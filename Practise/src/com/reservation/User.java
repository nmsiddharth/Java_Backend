package com.reservation;


public class User extends Thread {
	
	private String userName;
	private int seatsRequired;
	private Booking booking;
	
	User(String userName,int seatsRequired,Booking booking){
		this.userName = userName;
		this.seatsRequired = seatsRequired;
		this.booking = booking;
	}

	public void run() {
		this.getBookingStatus();
	}
	public void getBookingStatus() {
		this.booking.booking(this.userName, this.seatsRequired);
	}

}
