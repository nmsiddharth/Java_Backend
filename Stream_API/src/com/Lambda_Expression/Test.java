package com.Lambda_Expression;

@FunctionalInterface
interface Calculation{
	void m1();
}

//class S implements Calculation{
//
//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
public class Test {

	public static void main(String[] args) {

		Calculation cal = ()->{System.out.println("m1() is implemented");};
		cal.m1();
		
		// without lambda expression
//		S cal = new S();
//		cal.m1();
	}

}
