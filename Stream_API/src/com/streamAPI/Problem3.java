package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {

	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(2,222,234,567,890,432,236,212,22);
		List<Integer> result = list.stream().map(x->String.valueOf(x)).filter(x->x.startsWith("2")).map(x->Integer.parseInt(x)).collect(Collectors.toList());
		System.out.println(result);

	}

}
