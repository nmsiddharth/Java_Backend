package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Max_and_Min_value {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
		int maxValue = list.stream().mapToInt(x->x).max().getAsInt();
		System.out.println(maxValue);
		
		int minValue = list.stream().mapToInt(x->x).min().getAsInt();
		System.out.println(minValue);

	}

}
