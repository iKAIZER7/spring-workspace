package com.coforge.training.springcore.model;

/**
* Author :Vivek.Patel
* Date   :Jul 30, 2025
* Time   :11:21:46 AM
* Project:spring-core
*/

public class Employee1 {
 private int empID;
 private String name;
 private Address1 address;
 private Department department;
 public Employee1(int empID, String name, Address1 address, Department department) {
	super();
	this.empID = empID;
	this.name = name;
	this.address = address;
	this.department = department;
 }
 public void displayEmployeeInfo() {
	 System.out.println("Employee ID :"+empID);
	 System.out.println("Employee Name :"+name);
	 System.out.println("Address :"+address);
	 System.out.println("Department :"+department);

 }
}
