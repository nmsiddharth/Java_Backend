package com.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Mobile m1 = context.getBean("mobile",Mobile.class);
		Mobile m2 = context.getBean("mobile",Mobile.class);

		if(m1.hashCode()==m2.hashCode()) {
			System.out.println("same object");
		}else {
			System.out.println("Different object");
		}
	}

}
