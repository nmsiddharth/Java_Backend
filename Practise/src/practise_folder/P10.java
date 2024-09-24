package practise_folder;

public class P10 {

	public static void main(String[] args) {
		String arr[] = {"break","case","continue","default"};
		String input = "case";
		int flag = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==input) {
				flag = 1;
				//System.out.println(input+" is keyword");
				break;
			}
		}
		if(flag==1) {
			System.out.println(input+" is keyword");
		}else {
			System.out.println(input+" is not keyword");
		}

	}

}
