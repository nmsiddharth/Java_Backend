package com.Loops;

public class CountOf3AndAdd {

	public static int check() {
		int number = 32333334;
		int sum = 0;
		while(number>0) {
			int rem = number%10;
			number = number/10;    // till number < 0 , it iterates
			if(rem==3) {
			  sum = sum+rem;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CountOf1 obj =new CountOf1();
//		System.out.println(obj.check());
		
		System.out.println(CountOf3AndAdd.check());

	}

}
