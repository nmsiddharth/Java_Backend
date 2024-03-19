package com.java.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		Sim sim = new Airtel();           // sim is the reference of Sim Interface 
//		System.out.println(sim.getSimName());
//		System.out.println(sim.getTariffRate());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Sim sim = (Sim)context.getBean("sim");  // new Vodafone()
		System.out.println(sim.getSimName());
	}

}
