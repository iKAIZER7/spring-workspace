package com.coforge.training.springcore.model;

/**
* Author :Vivek.Patel
* Date   :Jul 30, 2025
* Time   :11:16:35 AM
* Project:spring-core
*/

public class Department {
	private String name;

	public Department(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	
}
