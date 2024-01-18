package com.List;

import java.util.LinkedList;

public class ReturnMiddleElement {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=1;i<=11;i++) {
			list.add(i*i);
		}
		System.out.println(list);
		
		int size = list.size();
		System.out.println("size = "+size);
		
		if(size%2==0) {
			System.out.println(list.get(size/2-1));
		}else {
			System.out.println(list.get(size/2));
		}
	}
	
	

}
