package com.spring.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PatientLCInterface implements InitializingBean,DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside interfaces setter method");
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init interface");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy interfaces");
		
	}
	
	

}
