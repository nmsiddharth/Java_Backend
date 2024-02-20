package com.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL_Util {
	private static SessionFactory factory =  null;
	private static SessionFactory getSessionfactory() {
		if(factory==null) {
			factory = new Configuration().configure(). buildSessionFactory();
		}
		return factory;
	}
	
	
	// insert operation
	
	public static void addData(Product product) {
		Session session = getSessionfactory().openSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
		session.close();
		System.out.println("Product Saved successfully");
	}
	
	
	// get all products
	public static List<Product> getAllProducts(){
		String hql = "from Product";
		Session session = getSessionfactory().openSession();
		session.createQuery(hql);
		Query<Product> query = session.createQuery(hql);  
		return query.list();
	}
	
	
	// get Product based on ID
	public static Product getProductById(int id) {
		String hql = "from Product as p where p.productId = :productId";
		Session session = getSessionfactory().openSession();
		Query<Product> query = session.createQuery(hql);
		query.setInteger("productId", id);
		return query.getSingleResult();
	}
	
	
	
	//Update Product
	public static void updateProduct(int productId, double productPrice) {
		String hql = "update Product as p set p.productPrice =:price where p.productId =:id";
		Session session = getSessionfactory().openSession();
		session.beginTransaction();
		Query<Product> query = session.createQuery(hql);
		query.setDouble("price", productPrice);
		query.setInteger("id", productId);
		int i = query.executeUpdate();
		session.getTransaction().commit();
		if(i>0) {
			System.out.println("Product updated successfully");
		}else {
			System.out.println("Something went wrong");
		}
		
		}
	
	
	
	//Delete operation
		public static void deleteProduct(int productId) {
		String hql = "delete from Product p where p.productId =:id";
		Session session = getSessionfactory().openSession();
		session.beginTransaction();
		Query<Product> query = session.createQuery(hql);
		query.setInteger("id", productId);
		int i = query.executeUpdate();
		session.getTransaction().commit();
		if(i>0) {
			System.out.println("Product deleted successfully");
		}else {
			System.out.println("Something went wrong");
		}		
	}
		
		
		//Pagination
		public static List<Product> pagination(){
			String hql = "from Product";
			Session session = getSessionfactory().openSession();
			session.createQuery(hql);
			Query<Product> query = session.createQuery(hql);  
			query.setFirstResult(0);
			query.setMaxResults(2);
			return query.list();
		}
}
