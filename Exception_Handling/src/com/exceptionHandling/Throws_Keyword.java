package com.exceptionHandling;

class AgeVerificationException extends Exception{
	private String message;
	public AgeVerificationException() {}       // Default Constructor
//	public AgeVerificationException(String message) {
//		this.message = message;
//	}
//	
//	public String getExceptionMessage() {
//		return this.message;
//	}
}

public class Throws_Keyword {

	public static void m1(int age) throws AgeVerificationException {
		if(age<18) {
			throw new AgeVerificationException();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Throws_Keyword.m1(17);
		} catch (AgeVerificationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
