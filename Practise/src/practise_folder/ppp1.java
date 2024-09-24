package practise_folder;

import java.util.HashSet;
import java.util.Set;

public class ppp1 {

	public static void check(String str) {
		Set<Character> set = new HashSet<>();
		
		int i = 0;
		int j = 0;
		int max = 0;
		int length = str.length();
		while(i<length && j<length) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				max = Math.max(max, j-i);
			}else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		String str = "abb";
		check(str);

	}

}
