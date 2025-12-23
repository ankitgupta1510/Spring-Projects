package com.payment.system;

public class UPIPaymant implements PaymentMode{

	@Override
	public void pay(Integer amount) {
		// TODO Auto-generted method stub
		System.out.println("Payed through upi amount=" + amount);
	}

}
