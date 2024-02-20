package com.One_To_Many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestRead {

	public static void main(String[] args) {
		 SessionFactory factory = new Configuration().configure().buildSessionFactory();
		   Session session = factory.openSession();
		   Employee e1 = session.get(Employee.class, 1);
		   session.close();
		   
		   
		   System.out.println("--------------------------Lazy Loading---------------------------");
		   Session session2 = factory.openSession();
		   Employee e2 = session2.get(Employee.class, 1);
		   System.out.println(e2.getAccounts().get(0).getAccountNumber());
		   session2.close();
	}

}
