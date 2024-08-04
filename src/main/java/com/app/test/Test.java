package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Sales;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("---------- Beans Names -----------");
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
		
		Sales sales = applicationContext.getBean(Sales.class);
		System.out.println("----- Product Details -------");
		sales.getProductDetails();
		
		System.out.println("------- Payment Details -------");
		sales.getPaymentDetails();
		
		System.out.println("------- Expensive Product Details -------");
		sales.getExpensiveProductDetails();
		
		System.out.println("------- Cheap Product Details -------");
		sales.getCheapProductDetails();
		
	}
}
