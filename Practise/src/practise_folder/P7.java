package practise_folder;

public class P7 {

	public static void main(String[] args) {
		 int arr[] = { 7, 1, 5, 6, 4 };
		 int buy = arr[0];
		 int maxP = 0;
		 
		 for(int i=1;i<arr.length;i++) {
			 if(buy>arr[i]) {
				 buy = arr[i];
			 }else if(arr[i]-buy > maxP) {
				 maxP = arr[i] - buy;
			 }
		 }
		 System.out.println(maxP);

	}

}
