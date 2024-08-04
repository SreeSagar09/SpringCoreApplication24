package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.app.Product;

@Configuration
@ComponentScan(basePackages = "com.app")
public class AppConfig {
	@Bean
	public Product iphone() {
		Product product = new Product();
		product.setProductName("Iphone-15Pro");
		product.setQuantity(12);
		product.setPrice(75000.00);
		product.setVendor("Apple");

		return product;
	}

	@Bean
	public Product mi() {
		Product product = new Product();
		product.setProductName("Mi-Y2");
		product.setQuantity(12);
		product.setPrice(25000.00);
		product.setVendor("Xiomi");

		return product;
	}

	@Bean
	public Product samsung() {
		Product product = new Product();
		product.setProductName("Samsung-Galaxy");
		product.setQuantity(6);
		product.setPrice(55000.00);
		product.setVendor("Samsung");

		return product;
	}

	@Bean
	public Product oneplus() {
		Product product = new Product();
		product.setProductName("OnePlus-N21");
		product.setQuantity(9);
		product.setPrice(65000.00);
		product.setVendor("OnePlus");

		return product;
	}
}
