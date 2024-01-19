package practise_folder;

import java.util.Map;
import java.util.TreeMap;

public class Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new TreeMap<>();
		
		map.put(2, 10);
		map.put(2, 20);
		map.put(6, 10);
		map.put(9, 40);
		//map.put(null, 3);
		map.put(4, null);
		map.put(7, 10);
		System.out.println(map);
		//access value
		System.out.println(map.get(6));
		System.out.println(map.getOrDefault(5, 56));
		
		//traverseing 
		
		for(Map.Entry<Integer, Integer> siddu:map.entrySet()) {
			System.out.println(siddu.getKey()+" -> "+siddu.getValue());
		}
		
		// searching for key
		if(map.containsKey(6)) {
			System.out.println(map.get(6));
		}
		

	}

}
