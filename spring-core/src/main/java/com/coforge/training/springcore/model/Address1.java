package com.coforge.training.springcore.model;

/**
* Author :Vivek.Patel
* Date   :Jul 30, 2025
* Time   :11:19:46 AM
* Project:spring-core
*/

public class Address1 {
	
	private String street;
	private String city;
	public Address1(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address1 [street=" + street + ", city=" + city + "]";
	}
	
	

}
