package practise_folder;

import java.util.HashSet;
import java.util.Set;

public class P9 {

	public static void check() {
		int n1 = 101;
		int n2 = 200;
		int count = 0;
		
		for(int i=n1;i<=n2;i++) {
			Set<Character> set = new HashSet<>();
			
			String str = String.valueOf(i);
			int size = str.length();
			
			for(char data: str.toCharArray()) {
				set.add(data);
			}
			
			if(set.size() == size) {
				count++;
			}
			
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();

	}

}
