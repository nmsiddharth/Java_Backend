package com.Lambda_Expression;

@FunctionalInterface
interface Calculations{
//	void add(int a,int b);
	
	//String reverseString(String str);
	
	int sumOfElements(int[] arr);
}
public class Test_2 {

	public static void main(String[] args) {
//		Calculations cal = (a,b)->{System.out.println(a+b);}; 
//		cal.add(24, 45);
		
//		Calculations cal = (str)->{
//			StringBuffer sb = new StringBuffer(str);
//			return sb.reverse().toString();
//		};
//		System.out.println(cal.reverseString("Hello Siddharth"));

		Calculations cal = (arr)->{
			int sum =0;
			for(int data:arr) {
				sum += data;
			}
			return sum;
		};
		
		int [] ar = {1,2,3,4,5};
		System.out.println(cal.sumOfElements(ar));
	}

}
