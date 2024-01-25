package com.reservationSystem;

public class Main_Method {

	public static void main(String[] args) {
		Booking book = new Booking();
		UserEntity user1 = new UserEntity("Siddu",book,7);
		UserEntity user2 = new UserEntity("Yash",book,5);
		
		user1.start();
		user2.start();
		

	}

}
