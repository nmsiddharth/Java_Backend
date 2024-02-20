package com.One_T0_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestRead {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Employee_data emp = session.get(Employee_data.class, 1);
		System.out.println(emp.getEmpName());
		System.out.println(emp.getDepartment().getDeptName());
		
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Loading dept object");
		Department_data dept =  session.get(Department_data.class, 1);
		System.out.println(dept.getDeptName());
		System.out.println(dept.getEmp().getEmpName());

	}

}
