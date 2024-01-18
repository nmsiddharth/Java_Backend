package com.List;

import java.util.Stack;

public class Stack_Intro {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		// Push operation
		stack.push(12);
		stack.push(1);
		stack.push(45);
		stack.push(70);
		stack.push(69);
		stack.push(7); // Top element
		
			System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		System.out.println(stack.search(45));

	}

}
