package com.homework_8;

public class Driver {
    public static  void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms = new SmsChannel();
        
        Notification onlineEmail = new OnlinePaymentNotification(email);
        Notification onlineSms = new OnlinePaymentNotification(sms);

        Notification cashEmail = new CashOnDeliveryPayment(email);
        Notification cashSms = new CashOnDeliveryPayment(sms);

        Notification bitcoinEmail = new BitcoinPayment(email);
        Notification bitcoinSms = new BitcoinPayment(sms);
        
        onlineEmail.sendNotification();
        onlineSms.sendNotification();

        cashEmail.sendNotification();
        cashSms.sendNotification();

        bitcoinEmail.sendNotification();
        bitcoinSms.sendNotification();

    }
}