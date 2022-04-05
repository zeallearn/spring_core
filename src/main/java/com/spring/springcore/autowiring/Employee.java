package com.spring.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private int id;
	
	private Address address;
	
	Employee(Address address){
		this.address= address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}
	
	@Autowired(required=false)
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

}
