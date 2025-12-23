package com.payment.system;

public class CCPayment implements PaymentMode {

	@Override
	public void pay(Integer amount) {
		// TODO Auto-generated method stub
		System.out.println("amount debited :: "+amount);
	}

}
