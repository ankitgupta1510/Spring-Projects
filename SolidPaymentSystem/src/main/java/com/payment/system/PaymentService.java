package com.payment.system;

public class PaymentService {
	private PaymentMode paymentMode;
	private NotificationSender notificationSender;
	
	public PaymentService(PaymentMode paymentMode, NotificationSender notificationSender) {
		super();
		this.paymentMode = paymentMode;
		this.notificationSender = notificationSender;
	}
	
	
	void processPayment(String name, Integer amount) {
		paymentMode.pay(amount);
		System.out.println("Txn saved in db");
		notificationSender.sendNotification("Hello", "Ankit");
	}
	
	
}
