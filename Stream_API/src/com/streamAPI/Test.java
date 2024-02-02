package com.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		 // Creating stream of objects
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		List<Integer> list2 = Arrays.asList(11,12,13,14,15,16);
		
		// Stream()
		Stream<Integer> stream = list.stream();  // converts pre-defined collections into stream of objects
		//[1,2,3,4,5,6,7,8,9,10]
		
		//of()
		Stream<String> stream2 = Stream.of("Sid","Virat","Dhoni"); // converts user defined objects into stream of objects 
		Stream<Integer> stream3 = list2.stream();
		
		//Intermediate-operations and Terminal operation
		// filter
		
		List<Integer> evenList = stream.filter(x->x%2==0).collect(Collectors.toList());
		System.out.println("evenList = "+evenList);
		
		//map
		List<Integer> evenSqrList = stream3.filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
		System.out.println("evenSqrList = "+evenSqrList);
		
		//sorted()
		stream2.sorted().forEach(System.out::println);
		
		//distinct()
		List<Integer> data = Arrays.asList(1,2,1,3,4,5,3,5,4);
		data.stream().distinct().forEach(System.out::println);
		
		//anyMatch()
		List<String> names = Arrays.asList("Ankit","Ashish","Sid","Siddu");
		
		boolean result = names.stream().anyMatch(x->x.startsWith("As"));
		System.out.println(result);
		
		//allMatch()
		boolean result2 = names.stream().allMatch(x->x.startsWith("As"));
		System.out.println(result2);
		
		//reduce()
		List<Integer>elements = Arrays.asList(1,2,3,4,5,6);
		int sum = elements.stream().reduce((a,b)->a+b).get();
		System.out.println(sum);
	}
	

}
