package practise_folder;

public class P11 {

	public static void main(String[] args) {
		int low = 9;
		int high = 105;
		
		for(int i=low;i<=high;i++) {
			if(high >=100) {
				System.out.println(String.format("%03d",i));
			}else if(high >=10) {
				System.out.println(String.format("%02d",i));
			}else {
				System.out.println(String.format("%d",i));
			}
		}

	}

}
