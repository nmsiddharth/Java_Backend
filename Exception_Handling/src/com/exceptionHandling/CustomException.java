package com.exceptionHandling;

class AgeVerificationFailedException extends Exception{
	private String message;
	public AgeVerificationFailedException(String message) {
		this.message = message;
	}
	
	public String getExceptionMessage() {
		return this.message;
	}
}

class Onlinevoting{
	public static void ageVerification(int age) {
		if(age<18) {
			try {
				throw new AgeVerificationFailedException("Age verification failed");
			}catch(AgeVerificationFailedException ae) {
				System.out.println(ae.getExceptionMessage());
			}
		}else {
			System.out.println("Welcome to voting");
		}
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onlinevoting.ageVerification(17);

	}

}
