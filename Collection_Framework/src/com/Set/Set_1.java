package com.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		
		//add elements
		set.add(19);
		set.add(3);
		set.add(5);
		set.add(20);
		set.add(3);
		set.add(null); 
		System.out.println(set);
		
		//Check the element
		System.out.println(set.contains(3));
		
		//Traversal
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		
		//Remove
		System.out.println(set.remove(5));   // returns boolean value
		System.out.println(set);
		
	}

}
