package com.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest_and_Lowest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,10,20,30,50,1,13,1,2,2,10,30,19,3);
		int secondLowest = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secondLowest);
		
		list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).forEach(System.out::print);
		

	}

}
