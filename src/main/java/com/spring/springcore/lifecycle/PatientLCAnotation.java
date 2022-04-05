package com.spring.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PatientLCAnotation  {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside interfaces setter method annotation");
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	@PostConstruct
	public void hi() {
		System.out.println("inside hi method annotation");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Inside bye method annotation");
	}
	

}
