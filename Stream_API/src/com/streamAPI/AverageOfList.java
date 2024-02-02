package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class AverageOfList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		double result = list.stream().mapToInt(x->x).average().getAsDouble();
		System.out.println(result);
	}

}
