package practise_folder;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		if(num<0 && num>9999) {
			System.out.println("Invalid");
		}else {
			int a = num%10;  // ones
			int b = num/10;
			int c = b%10;   //tens
			int d = num/100;
			int e = d%10;   //hundred
			int f = num/1000;  // thousand
			
			String sD[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
			String ty[] = {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
			String h = "Hundred";
			String th = "Thousand";
			
			if(num>0 && num<20) {
				System.out.println(sD[num]);
			}else if(num>19 && num<100) {
				System.out.println(ty[c]+" "+sD[a]);
			}else if(num>100 && num<1000) {
				System.out.println(sD[e]+" "+h+" "+ty[c]+" "+sD[a]);
			}else {
				System.out.println(sD[f]+" "+th+" "+sD[e]+" "+h+" "+ty[c]+" "+sD[a]);
			}

		}
	
		
		}
	}

