package practise_folder;

import java.util.Arrays;

public class P13 {

	public static void main(String[] args) {
		int arr[] = {4,5,0,1,9,0,5};
		
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count] = arr[i];
				count++;
			}
		}
		while(count<arr.length) {
			arr[count] = 0;
			count++;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
