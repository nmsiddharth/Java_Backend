package com.reservationSystem;

public class UserEntity extends Thread{

	private String userName;
	private int seatsRequired;
	private Booking booking;
	
	UserEntity(String userName, Booking booking, int seatsRequired){
		this.userName = userName;
		this.booking = booking;
		this.seatsRequired = seatsRequired;
	}
	
	public void run() {
		this.getBookingStatus();
	}
	
	public void getBookingStatus() {
		this.booking.ticketBooking(this.userName, this.seatsRequired);
	}
	
}
