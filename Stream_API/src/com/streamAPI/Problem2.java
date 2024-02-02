package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Problem2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,10,20,30,25);
		double result = list.stream().mapToInt(x->x*x).filter(x->x>100).average().getAsDouble();
		System.out.println(result);
	}

}
