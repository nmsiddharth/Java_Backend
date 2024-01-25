package com.reservationSystem;

public class Booking {
	static int availableSeats = 10;
	public synchronized void ticketBooking(String userName, int requestedSeats) {
		System.out.println("-----------Welcome to Indian Railways----------");
		System.out.println("Welcome "+userName+" . Requested Seats : "+requestedSeats);
		System.out.println("Checking for availability of seats. Please wait.....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(requestedSeats<=availableSeats) {
			availableSeats = availableSeats - requestedSeats;
			System.out.println("Seats available : "+availableSeats);
			System.out.println("Requested seats for the user : "+userName+" booked successfully");;
		}else{
			System.out.println("No seats available "+userName+" . Sorry for the inconvience");;
		}
		
	}
	

}
