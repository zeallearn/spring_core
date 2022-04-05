package com.spring.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/autowiring/config.xml");
		
		Employee E3 = (Employee) ctx.getBean("employee");
		System.out.println(E3);

		
	}

}
