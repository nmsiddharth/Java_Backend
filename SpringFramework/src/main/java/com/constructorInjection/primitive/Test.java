package com.constructorInjection.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student obj = context.getBean("student",Student.class);  //  => new Student(101,"Sid")
		System.out.println(obj);

	}

}
