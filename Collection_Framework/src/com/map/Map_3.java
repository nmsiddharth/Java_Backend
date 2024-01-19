package com.map;

import java.util.Map;
import java.util.TreeMap;

public class Map_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new TreeMap<>();
		
		//add
				map.put("Akash", 23);
				map.put("Akshay", 34);
				map.put("Akishit", 38);
				
				System.out.println(map);
				
				
		        map.put("Siddu", 53);
				System.out.println(map);
				
//				map.put(null, 53);
//				System.out.println(map);
//				
				map.put("Rahul", null);
				System.out.println(map);
				
//				map.put(null, null);
//				System.out.println(map);
//				
				// Accessing value
				System.out.println(map.get("Siddu"));
				
				// Traverse the Map
				for(Map.Entry<String, Integer> entry: map.entrySet()) {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue());
				}
				
				// Searching for the key
			if(map.containsKey("Siddu")) {
				System.out.println(map.get("Siddu"));
			}


	}

}
