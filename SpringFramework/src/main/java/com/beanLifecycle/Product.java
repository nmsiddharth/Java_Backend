package com.beanLifecycle;

public class Product {
	private String name;
	
	Product(){
		System.out.println("Bean created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter method called");
		this.name = name;
	}
	
	public void init() {
		System.out.println("init() called");
	}
	
	public void show() {
		System.out.println("custom method called");
	}
	
	public void destroy() {
		System.out.println("destroy() called");
	}
	
	
}
