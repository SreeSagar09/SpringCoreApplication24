package com.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//Using Qualifier annotation at class level
@Qualifier(value = "onlinePayment")
public class OnlinePayment implements Payment {

	@Override
	public void paymentMode() {
		System.out.println("Payment mode is: Online");
	}

}
