package com.autowiring.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	System.out.println(context.getBean("emp",Employee.class));

	}

}
