package com.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_List_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		// Insertion
		list.add(11);
		list.add(2);
		list.add(5);
		list.add(31);
		
		System.out.println(list);
		
		//Access the Elements
		
		System.out.println(list.get(1));
		
		//Traversal
		
		// using for loop
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		// using Enhanced for-loop
		for(Integer data:list) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		//using Iterator
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();

		// To Update
		list.set(1, 101);
		System.out.println(list);
		
		// To Delete
		list.remove(2);
		System.out.println(list);
	}

}
