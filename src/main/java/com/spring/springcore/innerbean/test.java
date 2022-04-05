package com.spring.springcore.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.autowiring.Employee;

public class test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/autowiring/config.xml");

		Employee E3 = (Employee) ctx.getBean("employee");
		System.out.println(E3);
		System.out.println(E3.hashCode()); //singlton if hashcode same which is default
		
		Employee E2 = (Employee) ctx.getBean("employee");
		System.out.println(E2);
		System.out.println(E2.hashCode());

	}

}
