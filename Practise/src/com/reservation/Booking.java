package com.reservation;

public class Booking {
	public static int availableSeats = 10;
	
	public synchronized void booking( String userName,int RequestedSeats) {
		System.out.println("Welcome "+userName+" . Requested Seats : "+RequestedSeats);
		System.out.println("Checking for availability of seats. Please wait.....");
		
		if(RequestedSeats<=availableSeats) {
			availableSeats = availableSeats - RequestedSeats;
			System.out.println("Seats available : "+availableSeats);
			System.out.println("Requested seats for the user : "+userName+" booked successfully");;
		}else {
			System.out.println("No seats available "+userName+" . Sorry for the inconvience");;
		}
	}
	
}
