package com.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<>();
		
		//add
		set.add("Sid");
		set.add("Virat");
		set.add("Dhoni");
		set.add("Sid");
		set.add(null);
		System.out.println(set);

	}

}
