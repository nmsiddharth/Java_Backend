package practise_folder;

public class P6 {

	public static void main(String[] args) {
		int[] arr = {5,9,4,2,7};
		int small = arr[0];
		
		for(int data:arr) {
			if(small>data) {
				small = data;
			}
		}
		
		int secondSmall = arr[0];
		for(int i=1;i<arr.length-1;i++) {
			if(secondSmall>arr[i] && small<arr[i]) {
				secondSmall = arr[i];
			}
		}
		System.out.println(secondSmall);

	}

}
