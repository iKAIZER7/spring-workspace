package com.coforge.training.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.training.springcore.model.Address1;
import com.coforge.training.springcore.model.Department;
import com.coforge.training.springcore.model.Employee;
import com.coforge.training.springcore.model.Employee1;

/**
* Author :Vivek.Patel
* Date   :Jul 30, 2025
* Time   :11:27:58 AM
* Project:spring-core
*/

@Configuration
public class Employee1Config {
@Bean
public Address1 address1() {
	return new Address1("123 Maun street","Spring feild");
	
}
@Bean
public Address1 address2() {
	return new Address1("126 Temple street","Mathura");
	
}
@Bean
public Department department1() {
	return new Department("Engineering");
	
}
@Bean
public Department department2() {
	return new Department("Sales");
	
}
@Bean
public Employee1 employee1() {
	return new Employee1(101,"John doe",address1(),department1());
	
}
@Bean
public Employee1 employee2() {
	return new Employee1(103,"ram kumar",address2(),department2());
	
}
}
