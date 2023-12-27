package com.Loops;

public class CountOf1 {

	public static int check() {
		int number = 12111134;
		int count = 0;
		while(number>0) {
			int rem = number%10;
			number = number/10;    // till number < 0 , it iterates
			if(rem==1) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CountOf1 obj =new CountOf1();
//		System.out.println(obj.check());
		
		System.out.println(CountOf1.check());

	}

}
