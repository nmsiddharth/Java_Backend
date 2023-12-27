package com.javaLearning;

class Product{
	int Id;
	String Name;
	
	public Product(int id, String name) {
		this.Id = id;
		this.Name = name;
	}
	
	public void show() {
		System.out.println(this.Id + this.Name); 
	}
	
	
	
}
public class UseOfThis_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product(101,"Stark");
		p.show();

	}

}
