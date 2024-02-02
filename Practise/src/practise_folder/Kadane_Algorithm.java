package practise_folder;

public class Kadane_Algorithm {

	public static void check() {
		int[] arr = {-1, 5, -50, -3, -90};
		
		int start = 0;
		int currentStart = 0;
		int end = 0;
		
		int sum = arr[0];
		int maxSum = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(sum>=0) {
				sum += arr[i];
			}else {
				sum = arr[i];
				currentStart = i;
			}
			if(maxSum<sum) {
				maxSum = sum;
				start = currentStart;
				end = i;
			}
		}
		System.out.println(maxSum);
		subArray(arr, start, end);
	}
	
	public static void subArray(int[]arr, int start, int end) {
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
