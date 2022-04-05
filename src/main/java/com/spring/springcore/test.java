package com.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		//primitive type
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee id is:" + emp.getId());
		System.out.println("Employee name is:" + emp.getName());
		
		//collection list
		HospitalList hospital = (HospitalList) ctx.getBean("hospital");
		System.out.println(hospital.getDepartments());
		System.out.println(hospital.getName());
		
		//ref dependency injection
		StudentRef st = (StudentRef) ctx.getBean("student");
		System.out.println(st);
		
		
	}

}
