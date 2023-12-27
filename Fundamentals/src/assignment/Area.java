package assignment;

public class Area {
	public double area(int radius) {
		return Math.PI* Math.pow(radius, 2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj = new Area();
		double result = obj.area(5);
		System.out.println(result);
		
		

	}

}
