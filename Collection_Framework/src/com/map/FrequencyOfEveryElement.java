package com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfEveryElement {

	public static void getFrequency(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int data:arr) {
			if(!map.containsKey(data)) {
				map.put(data, map.getOrDefault(data, 1));
			}else {
				map.put(data, map.get(data)+1);
			}
		}
		System.out.println(map);
	}
	
	public static void FrequencyOfParticularElement(int[]arr, int key) {
Map<Integer,Integer> map = new HashMap<>();
		
		for(int data:arr) {
			if(!map.containsKey(data)) {
				map.put(data, map.getOrDefault(data, 1));
			}else {
				map.put(data, map.get(data)+1);
			}
		}
		if(map.containsKey(key)) {
			System.out.println(map.get(key));
	}
	}
	
	public static void firstNonrepeatingNumber(int[]arr){
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int data:arr) {
			if(!map.containsKey(data)) {
				map.put(data, map.getOrDefault(data, 1));
			}else {
				map.put(data, map.get(data)+1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First Non-Repeating Number :"+entry.getKey());
				break;
			}
		}
	}
	
	public static void firstRepeatingNumber(int[]arr) {
Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int data:arr) {
			if(!map.containsKey(data)) {
				map.put(data, map.getOrDefault(data, 1));
			}else {
				map.put(data, map.get(data)+1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("First Repeating Number :"+entry.getKey());
				break;
			}
		}
	}
	
	public static int[] NonrepeatingNumber(int[]arr){
		List<Integer> list = new ArrayList<>();
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int data:arr) {
			if(!map.containsKey(data)) {
				map.put(data, map.getOrDefault(data, 1));
			}else {
				map.put(data, map.get(data)+1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				list.add(entry.getKey());
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2,1,4,5,5,4,4,5,0};
		int key = 5;
		getFrequency(arr);
		FrequencyOfParticularElement(arr,key);
		firstNonrepeatingNumber(arr);
		firstRepeatingNumber(arr);
//		int[] ar = NonrepeatingNumber(arr);
//		for(int data:ar) {
//			System.out.print(data+ " ");
//		}
		
		System.out.println(Arrays.toString(NonrepeatingNumber(arr)));

	}

}
