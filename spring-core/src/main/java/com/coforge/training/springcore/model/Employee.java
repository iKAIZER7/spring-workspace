package com.coforge.training.springcore.model;

/**
* Author :Vivek.Patel
* Date   :Jul 29, 2025
* Time   :2:14:56 PM
* Project:spring-core
*/
/*
 * Spring uses POJO based programming Model
 * Constructor Dependency Injection using XML configuration
 */
public class Employee {

	 private int empId;
		private String name;
		private double salary;
		
		 public Employee(int empId, String name, double salary) {
			super();
			this.empId = empId;
			this.name = name;
			this.salary = salary;
		}

		 public void display() {
				System.out.println("************** Employee Details **********");
				System.out.println(this.empId+" "+this.name+" "+this.salary);
			}
}
