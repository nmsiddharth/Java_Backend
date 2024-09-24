package practise_folder;

public class P19 {

	
	public static void main(String[] args) {
		int arr[] = {7,4,8,2,9};
		int count = 1;
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				count++;
				max = arr[i];
			}
		}
		System.out.println(count);

	}

}
