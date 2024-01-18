package com.List;

import java.util.Vector;

public class VectorIntro {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		
		//add elements
		vector.add(23);
		vector.add(45);
		vector.add(7);
		vector.add(45);
		System.out.println(vector);
		
		//Read elements
		System.out.println(vector.get(2));
		
		//Traversing
		for(Integer obj: vector) {
			System.out.println(obj+" ");
		}
			
			// Update
			vector.set(2, 700);
			System.out.println(vector);
			
			//Remove
			vector.remove(1);
			System.out.println(vector);
		}

	}


