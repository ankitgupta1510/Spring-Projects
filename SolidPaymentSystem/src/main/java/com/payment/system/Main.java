package com.payment.system;

public class Main {
	public static void main(String[] args) {
		PaymentMode cardMode = new CCPayment();
        NotificationSender emailSender = new EmailSender();
        
        PaymentService service1 = new PaymentService(cardMode, emailSender);
        
        service1.processPayment("Ankit", 50000);
}
}