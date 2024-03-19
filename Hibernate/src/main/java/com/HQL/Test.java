
package com.HQL;

public class Test {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductName("HP");
		p1.setCategory("Laptop");
		p1.setProductPrice(67000);
		
		Product p2 = new Product();
		p2.setProductName("Dell");
		p2.setCategory("Laptop");
		p2.setProductPrice(75000);
		
		Product p3 = new Product();
		p3.setProductName("Iphone");
		p3.setCategory("Mobile");
		p3.setProductPrice(86000);
		
		Product p4 = new Product();
		p4.setProductName("X-Tab");
		p4.setCategory("Tablet");
		p4.setProductPrice(34000);
		
//		HQL_Util.addData(p1);
//		HQL_Util.addData(p2);
//		HQL_Util.addData(p3);
//		HQL_Util.addData(p4);
//		
//		for(Product p:HQL_Util.getAllProducts()) {
//			System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getCategory()+" "+p.getProductPrice());
//		}
//		
//		Product p = HQL_Util.getProductById(1);
//		System.out.println(p.getProductName());
		
		//HQL_Util.updateProduct(1,70000);
		//HQL_Util.deleteProduct(4);
		
		for(Product p:HQL_Util.pagination()) {
			System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getCategory()+" "+p.getProductPrice());
		}

	}

}
