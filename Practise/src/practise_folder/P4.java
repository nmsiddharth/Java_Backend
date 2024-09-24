package practise_folder;

public class P4 {

	public static void main(String[] args) {
		int arr[] = { 10, -20, -30, 0, 70, -80, -20 };
		
		int left = 1;
		int right = 1;
		int result = arr[0];
		int n = arr.length;
		
		for(int i=0;i<arr.length;i++) {
			left = left == 0 ? 1 :left;
			right = right == 0 ? 1:right;
			
			left *= arr[i];
			right *= arr[n-1-i];
			result = Math.max(result, Math.max(left, right));
		}
		System.out.println(result);
	}

}
