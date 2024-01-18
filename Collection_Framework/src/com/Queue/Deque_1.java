package com.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> deque = new ArrayDeque<>();
		
		//add
		deque.add(10);
		deque.add(4);
		System.out.println(deque);
		
		System.out.println(deque.peek());
		
		deque.addFirst(100);
		System.out.println(deque);
		System.out.println(deque.peekFirst());
		deque.addLast(50);
		System.out.println(deque);
		System.out.println(deque.peekLast());
		
		// Remove first element
		deque.pollFirst();
		System.out.println(deque);
		
		//Remove Last element
		deque.pollLast();
		System.out.println(deque);
		
		System.out.println(deque.poll());
		System.out.println(deque);
	}

}
