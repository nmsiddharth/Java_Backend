package com.ManyToMany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Project p1 = new Project();
		p1.setProjectName("p1");
		
		Project p2 = new Project();
		p2.setProjectName("p2");
		
		Project p3 = new Project();
		p3.setProjectName("p3");
		
		Student s1 = new Student();
		s1.setStudentName("s1");
		
		Student s2 = new Student();
		s2.setStudentName("s2");
		
		Student s3 = new Student();
		s3.setStudentName("s3");
		
		
		// creating a List of Projects
		List<Project> list1 = Arrays.asList(p1,p2);
		
		List<Project> list2 = Arrays.asList(p2,p3);
		
		List<Project> list3 = Arrays.asList(p1,p3);
		
		//Adding List of Projects to Students
		s1.setProjects(list1);
		s2.setProjects(list2);
		s3.setProjects(list3);
		
		//Creating List of Students
		List<Student> s_list1 = Arrays.asList(s1,s2);
		
		List<Student> s_list2 = Arrays.asList(s2,s3);
		
		List<Student> s_list3 = Arrays.asList(s1,s3);
		
		//Adding List of Students to Projects
		p1.setStudents(s_list1);
		p2.setStudents(s_list2);
		p3.setStudents(s_list3);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		 session.getTransaction().commit();
		  session.close();

	}

}
