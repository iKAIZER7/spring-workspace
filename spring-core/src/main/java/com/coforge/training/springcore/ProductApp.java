package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.config.ProductConfig;
import com.coforge.training.springcore.model.Product;

/**
* Author :Vivek.Patel
* Date   :Jul 30, 2025
* Time   :10:23:15 AM
* Project:spring-core
*/

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext context=new AnnotationConfigApplicationContext(ProductConfig.class);
         Product product1=context.getBean("product1",Product.class);
         Product product2=context.getBean("product2",Product.class);
         Product product3=context.getBean("product3",Product.class);
         
         System.out.println("product 1: "+ product1);
         System.out.println("product 2: "+ product2);
         System.out.println("product 3: "+ product3);
         
         ((AnnotationConfigApplicationContext)context).close();
	}

}
