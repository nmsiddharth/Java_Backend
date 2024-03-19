package com.setterInjection.collection_2;

import java.util.List;


public class Category1 {
	private int categoryId;
	private String categoryName;
	private List<Product> products;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Category1 [categoryId=" + categoryId + ", categoryName=" + categoryName + ", products=" + products
				+ "]";
	}
	
	
}
