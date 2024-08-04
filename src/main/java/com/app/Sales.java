package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sales {
	
	@Autowired
	//Using Qualifier annotation at field level
	@Qualifier(value = "samsung")
	private Product product;
	
	@Autowired
	private Payment onlinePayment;
	
	private Product expensiveProduct;
	@Autowired
	private void getExpensiveProducts(@Qualifier("iphone") Product expensiveProduct) {
		this.expensiveProduct = expensiveProduct;
	}
	
	private Product cheapProduct;
	@Autowired
	@Qualifier("mi")
	private void getCheapProducts(Product cheapProduct) {
		this.cheapProduct = cheapProduct;
	}
	
	public void getProductDetails() {
		System.out.println(product);
	}
	
	public void getPaymentDetails() {
		onlinePayment.paymentMode();
	}
	
	public void getExpensiveProductDetails() {
		System.out.println(expensiveProduct);
	}
	
	public void getCheapProductDetails() {
		System.out.println(cheapProduct);
	}
	
}
