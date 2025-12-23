package com.payment.system;

public class EmailSender implements NotificationSender {

	@Override
	public void sendNotification(String message,String name) {
		// TODO Auto-generated method stub
		System.out.println("Email sent to user" + name);
	}

}
