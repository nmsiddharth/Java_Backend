package com.List;

import java.util.ArrayList;
import java.util.List;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,1,2,3,3,4,5};
		
		List<Integer> list = new ArrayList<>();
		for(int data:arr) {
			if(!list.contains(data)) {
				list.add(data);
			}
		}
		System.out.println(list);
	}

}
