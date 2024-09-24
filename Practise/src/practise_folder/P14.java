package practise_folder;

public class P14 {

	public static void main(String[] args) {
		int arr [][] = {{0,1,0},{1,1,0},{1,0,1},{1,1,1}};
		int maxCount = 0;
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==1) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount = count;
				index = i+1;
			}
		}
		System.out.println(index);
		

	}

}
