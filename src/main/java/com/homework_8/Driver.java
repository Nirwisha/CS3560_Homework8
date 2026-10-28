package com.homework_8;

public class Driver {
    public static  void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sns = new SnsChannel();
        
        Notification onlineEmail = new OnlinePaymentNotification(email);
        Notification onlineSns = new OnlinePaymentNotification(sns);
        Notification cashEmail = new CashOnDeliveryPayment(email);
        Notification cashSns = new CashOnDeliveryPayment(sns);
        
        onlineEmail.sendNotification();
        onlineSns.sendNotification();
        cashEmail.sendNotification();
        cashSns.sendNotification();

    }
}