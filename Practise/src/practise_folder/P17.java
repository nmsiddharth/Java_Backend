package practise_folder;

import java.util.HashMap;
import java.util.Map;

public class P17 {

	public static void main(String[] args) {
	String str = "abbccccc";
	StringBuffer sb = new StringBuffer();
	
	Map<Character,Integer> map = new HashMap<>();
	
	for(char data: str.toCharArray()) {
		if(!map.containsKey(data)) {
			map.put(data, 1);
		}else {
			map.put(data, map.get(data)+1);
		}
	}
	
	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		sb.append(entry.getKey());
		if(entry.getValue()>1) {
			sb.append(entry.getValue());
		}
	}
	System.out.println(sb);
	}

}
