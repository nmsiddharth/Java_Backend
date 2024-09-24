package practise_folder;

public class P8 {

	public static void check(int num) {
		int result = 0;
		int i = 0;
		
		while(num>0) {
			int rem = num%10;
			result += (9 - rem)* Math.pow(10, i++);
			num = num/10;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		int num = 105671;
		
		if(num<0 || num>1000000) {
			System.out.println("Wrong input");
		}else {
			check(num);
		}

	}

}
