package com.HibernateLifeCycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	
		//Transient State
		System.out.println("Object is in Transient state");
		Person person = new Person();
		person.setFirstName("NM");
		person.setLastName("Siddharth");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();
		System.out.println("Object is in persistant state");
		session.close();
		System.out.println("session closed");
		
		person.setLastName("Virat");
		System.out.println(person);
		System.out.println("Object is in detached state");
		
		// From Detached State to Persistant State
		Session session2 = factory.openSession();
		session2.beginTransaction();
		session2.merge(person);
		session2.getTransaction().commit();
		System.out.println("Object is in persistant state");
		session2.close();
		
		//To Delete the Object
		Session session3 = factory.openSession();
		session3.beginTransaction();
		session3.remove(person);
		session3.getTransaction().commit();
		System.out.println("Object Removed");
		session3.close();

	}

}
