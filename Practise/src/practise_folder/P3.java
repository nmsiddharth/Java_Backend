package practise_folder;

import java.util.Arrays;

public class P3 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int k=3;
		int j= 1;
		 while(j<=k) {
			 int temp = arr[arr.length-1];
			 for(int i=arr.length-1;i>0;i--) {
				  arr[i] = arr[i-1];
			 }
			 arr[0]= temp;
			 j++;
		 }
		 System.out.println(Arrays.toString(arr));
	}

}
