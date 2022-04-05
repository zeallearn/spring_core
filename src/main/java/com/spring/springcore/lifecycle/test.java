package com.spring.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/lifecycle/config.xml");
		
		//Patient P1 = (Patient) ctx.getBean("patient");
		//System.out.println(P1);
		
		//pre-destruction hook required for destroy
		
		//PatientLCInterface P2 = (PatientLCInterface) ctx.getBean("patientInterface");
		//System.out.println(P2);
		
		PatientLCAnotation P3 = (PatientLCAnotation) ctx.getBean("patientAnnotation");
		System.out.println(P3);
		
		ctx.registerShutdownHook();

		
		
	}

}
