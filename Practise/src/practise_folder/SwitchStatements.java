package practise_folder;

import java.util.Scanner;

public class SwitchStatements {

	public static void getPosOrNeg(Scanner sc) {
		System.out.println("Enter a Number");
	    int num = sc.nextInt();
	    
	    if(num>0) {
	    	System.out.println("Positive number");
	    }else {
	    	System.out.println("Negative number");
	    }
	}
	
	public static String getEvenOrOdd(Scanner sc) {
		System.out.println("Enter a Number");
	    int number = sc.nextInt();
	    
	    if(number%2==0) {
	    	return "Even Number";
	    }else {
	    	return "Odd Number";
	
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Select Operations");
			System.out.println("1.(Pos/Neg)  2.(Even/odd)");
			int choose = sc.nextInt();
			switch(choose) {
			case 1 : getPosOrNeg(sc);
					break;
			case 2: System.out.println(getEvenOrOdd(sc));
					break;
			default: System.out.println("Incorrect Input");		
			}
			
			System.out.println("Do u want to continue y/n");
			ch = sc.next().charAt(0);
			
		}while(ch=='y');
		System.out.println("Thank u");

	}

}
