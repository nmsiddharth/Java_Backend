package practise_folder;

public class P12 {

	public static void main(String[] args) {
		String str = "##***";
		
		int hash = 0;
		int star = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='#') {
				hash++;
			}else if(str.charAt(i)=='*') {
				star++;
			}
		}
		
		if(hash>star) {
			System.out.println("Negative");
		}else if(star>hash) {
			System.out.println("Positive");
		}else {
			System.out.println("0");
		}

	}

}
