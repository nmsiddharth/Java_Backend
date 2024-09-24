package practise_folder;

public class P5 {

	public static void print(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		print(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		print(n);
	}

}
