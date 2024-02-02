package com.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,10,20,30,50,1,2,2,10,30,19,3);
		List<Integer> duplicateElements = list.stream().filter(x->Collections.frequency(list, x) > 1).distinct().collect(Collectors.toList());

		System.out.println(duplicateElements);
	}

}
