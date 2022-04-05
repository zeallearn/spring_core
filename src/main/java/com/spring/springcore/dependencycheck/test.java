package com.spring.springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/dependencycheck/config.xml");
		
		Prescription P3 = (Prescription) ctx.getBean("prescription");
		System.out.println(P3);
		
	}

}
