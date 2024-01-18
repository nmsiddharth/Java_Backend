package com.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new PriorityQueue<>();
		
		//add
		queue.add(21);
		queue.add(1);
		queue.add(14);
		queue.add(26);
		queue.add(6);
		System.out.println(queue);
		
		//Printing head element
		System.out.println(queue.peek());
		
		//Removing head element
		System.out.println(queue.poll());
		System.out.println(queue.peek());

	}

}
