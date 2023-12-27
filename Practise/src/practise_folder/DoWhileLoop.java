package practise_folder;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int choose;
		do {
			System.out.println("Enter a number");
			int num = sc.nextInt();
			if(num!=0) {
				sum = sum+num;
			}
			System.out.println("Do you want continue again ?");
			 choose = sc.nextInt();
		}while(choose!=0);
		System.out.println(sum);
	}

}
