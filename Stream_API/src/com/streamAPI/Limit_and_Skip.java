package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit_and_Skip {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,2,4,3,6,7,8);
		list.stream().limit(2).forEach(System.out::println);
		
		List<Integer> num = list.stream().skip(4).collect(Collectors.toList());
		System.out.println(num);

	}

}
