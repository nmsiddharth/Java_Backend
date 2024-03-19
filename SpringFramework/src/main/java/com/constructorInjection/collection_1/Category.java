package com.constructorInjection.collection_1;

import java.util.List;

public class Category {
	private int id;
	private String name;
	private List<String> products;
	public Category(int id, String name, List<String> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
	
	
}
