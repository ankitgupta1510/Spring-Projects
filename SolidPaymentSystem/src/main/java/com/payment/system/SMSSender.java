package com.payment.system;

public class SMSSender implements NotificationSender {

	@Override
	public void sendNotification(String message, String name) {
		// TODO Auto-generated method stub
		System.out.println(message + "SMS send to user" + name);
		
	}

}
