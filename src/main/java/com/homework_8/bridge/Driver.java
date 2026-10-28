package com.homework_8.bridge;

public class Driver {
    public static  void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel sms = new SmsChannel();
        NotificationChannel push = new PushChannel();
        
        Notification onlineEmail = new OnlinePaymentNotification(email);
        Notification onlineSms = new OnlinePaymentNotification(sms);
        Notification onlinePush = new OnlinePaymentNotification(push);

        Notification cashEmail = new CashOnDeliveryPayment(email);
        Notification cashSms = new CashOnDeliveryPayment(sms);
        Notification cashPush = new CashOnDeliveryPayment(push);

        Notification bitcoinEmail = new BitcoinPayment(email);
        Notification bitcoinSms = new BitcoinPayment(sms);
        
        onlineEmail.sendNotification();
        onlineSms.sendNotification();
        onlinePush.sendNotification();

        cashEmail.sendNotification();
        cashSms.sendNotification();
        cashPush.sendNotification();

        bitcoinEmail.sendNotification();
        bitcoinSms.sendNotification();

    }
}