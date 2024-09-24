package practise_folder;

public class P16 {

	public static void main(String[] args) {
		String str = "Knowledge is the greatest gift";
		
		int maxCount = 0;
		String [] newStr = str.split(" ");
		for(String data:newStr) {
			int count = data.length();
			
			if(count>maxCount) {
				maxCount = count;
			}
		}
		System.out.println(maxCount);

	}

}
