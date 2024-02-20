package com.One_To_Many;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	   Account a1 = new Account();
	   a1.setAccountNumber("SBI-1234");
	   
	   Account a2 = new Account();
	   a2.setAccountNumber("PNB-1234");
	   
	   List<Account> list1 = Arrays.asList(a1,a2);
	   
	   Employee e1 = new Employee();
	   e1.setEmpName("Harsh");
	   e1.setAccounts(list1);
	   
	   Account a3 = new Account();
	   a3.setAccountNumber("SBI-5678");
	   
	   Account a4 = new Account();
	   a4.setAccountNumber("PNB-9876");
	   
	   List<Account> list2 = Arrays.asList(a3,a4);
	   
	   a1.setEmployee(e1);
	   a2.setEmployee(e1);
	   
	   Employee e2 = new Employee();
	   e2.setEmpName("Aayush");
	   e2.setAccounts(list2);
	   
	   a3.setEmployee(e2);
	   a4.setEmployee(e2);
       
	   SessionFactory factory = new Configuration().configure().buildSessionFactory();
	   Session session = factory.openSession();
	   session.beginTransaction();
	   
	   session.save(e1);
	   session.save(e2);
	   
	   session.getTransaction().commit();
	   session.close();
	   
	   
	   
	   

	}

}