package com.List;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		System.out.println(linkedList.isEmpty());
		
		//Adding elements to LinkedList
		linkedList.add(10);
		linkedList.add(5);
		linkedList.add(30);
		System.out.println(linkedList);
		
		//Traversal Of Linked List
		System.out.print("head -> ");
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" -> ");
		}
		System.out.println("null");
		
		//adding element at Beginning of linkedList
		System.out.println("Adding element at Beginning of linkedList");
		linkedList.addFirst(101);
		
		System.out.print("head ->");
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" ->");
		}
		System.out.println("null");
		
		//Add element at given any index position
		System.out.println("Adding element at given any index position");
		linkedList.add(3,501);
		

		System.out.print("head ->");
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" ->");
		}
		System.out.println("null");
		
		//Adding element at last position
		System.out.println("Adding element at last position");
		linkedList.addLast(700);
		System.out.print("head ->");
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" ->");
		}
		System.out.println("null");
		
		//Reading the First Element
		System.out.println(linkedList.peek());
		

		//Reading the Last Element
		System.out.println(linkedList.peekLast());
		
		//Upddating the current node
		System.out.println("Updating existing element");
		linkedList.set(2, 2001);
		
		System.out.print("head ->");
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" ->");
		}
		System.out.println("null");
		
		
		//Deleting the element
		System.out.println("Removing Head element");
		System.out.println(linkedList.pollFirst());
		System.out.print("head ->");
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" ->");
		}
		System.out.println("null");
		
		//Deleting Element from given Index
		System.out.println("Deleting Element from given Index");
		System.out.println(linkedList.remove(1));
		
		System.out.print("head ->");
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" ->");
		}
		System.out.println("null");
		
		//Deleting Last Element
				System.out.println("Deleting Last Element");
				System.out.println(linkedList.pollLast());
				
				System.out.print("head ->");
				for(int i=0;i<linkedList.size();i++) {
					System.out.print(linkedList.get(i)+" ->");
				}
				System.out.println("null");
	}
	

}
