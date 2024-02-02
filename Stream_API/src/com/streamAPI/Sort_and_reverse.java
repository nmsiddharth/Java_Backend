package com.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_and_reverse {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(0,3,10,20,30,15,13,1,10);
		 List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
		 System.out.println(sort);
		 
		 List<Integer> reverse = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		 System.out.println(reverse);


	}

}
