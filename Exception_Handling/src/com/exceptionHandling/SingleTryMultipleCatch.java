package com.exceptionHandling;

public class SingleTryMultipleCatch {

	public static void m1() {
		try {
			String str = "123egf";
			int i = Integer.parseInt(str);
			System.out.println(i);
			
			int res = 12/0;
			System.out.println(res);
			
		}catch(ArithmeticException ae) {
			System.out.println("Exception handled in 1st catch block");
			ae.printStackTrace();
		}catch(NullPointerException npe) {
			System.out.println("Exception handled in 2nd catch block");
			npe.printStackTrace();
		}catch(NumberFormatException nfe) {
			System.out.println("Exception handled in 3rd catch block");
			nfe.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
