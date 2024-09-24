package practise_folder;

public class P15 {

	public static void main(String[] args) {
		int entry[] = {7,0,5,1,3};
		int exit [] = {1,2,1,3,4};
		int n = 5;
		int count = 0;
		int maxCount = 0;
		
		for(int i=0;i<n;i++) {
			count += entry[i]-exit[i];
			maxCount = Math.max(maxCount, count);
		}
		System.out.println(maxCount);
	}

}
