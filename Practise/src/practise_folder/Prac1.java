package practise_folder;

import java.util.HashMap;
import java.util.Map;

public class Prac1 {

	public static void check() {
		Map<Integer,Integer> map = new HashMap<>();
		int [] arr = {1,2,3,3,4,6,7,5,2,9,5};
		
		for(int data:arr) {
			if(!map.containsKey(data)) {
				map.put(data, 1);
			}else {
				map.put(data,map.get(data)+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

}
