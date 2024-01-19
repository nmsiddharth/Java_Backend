package practise_folder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_programs {

	public static void getFrequencyOfEachElement(int[] arr) {
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
	
	public static int[]  getNonRepeatingElements(int[] arr) {
		List<Integer> list = new ArrayList<>();
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int data1:arr) {
			if(!map.containsKey(data1)) {
				map.put(data1, map.getOrDefault(data1, 1));
			}else {
				map.put(data1, map.get(data1)+1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				list.add(entry.getKey());
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
		
	}
	
	public static int[] getDuplicateElements(int[] arr) {
		List<Integer> list = new ArrayList<>();
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int data1:arr) {
			if(!map.containsKey(data1)) {
				map.put(data1, map.getOrDefault(data1, 1));
			}else {
				map.put(data1, map.get(data1)+1);
			}
		}
		for(Map.Entry<Integer, Integer> ele:map.entrySet()) {
			if(ele.getValue()>1) {
				list.add(ele.getKey());
			}
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2,1,4,5,5,4,4,5,0};
		getFrequencyOfEachElement(arr);
		System.out.println(Arrays.toString(getNonRepeatingElements(arr)));
		System.out.println(Arrays.toString(getDuplicateElements(arr)));
		
		

	}

}
