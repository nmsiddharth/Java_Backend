package practise_folder;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		 
		 int start=0;
		 int end = arr.length-1;
		 while(start<end) {
			 int[] temp = arr[start];
			 arr[start]=arr[end];
			 arr[end]= temp;
			 start++;
			 end--;
		 }
		 
		 for(int i=0;i<arr.length;i++) {
			 int start1 =0;
			 int end1 = arr.length-1;
			 
			 while(start1<end1) {
				 int temp = arr[i][start1];
				 arr[i][start1] = arr[i][end1];
				 arr[i][end1] = temp;
				 start1++;
				 end1--;
			 }
		 }
		 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

}
