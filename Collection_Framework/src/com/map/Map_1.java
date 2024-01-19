package com.map;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		//add
		map.put("Siddu", 23);
		map.put("Virat", 34);
		map.put("Cristiano", 38);
		
		System.out.println(map);
		
		
        map.put("Siddu", 53);
		System.out.println(map);
		
		map.put(null, 53);
		System.out.println(map);
		
		map.put("Rahul", null);
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);
		
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
