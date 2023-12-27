package assignment;

public class SimpleInterest {
	
	static int p = 1000;
	static int r = 5;
	static int t = 3;
	
	public static int SI() {
		return (p*t*r)/100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = SimpleInterest.SI();
		System.out.println(result);

	}

}
