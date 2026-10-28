package com.homework_8;

public class CashOnDeliveryPayment extends Notification {
    public CashOnDeliveryPayment(NotificationChannel channel) {
        this.notificationChannel = channel;
    }

    public void sendNotification() {
        notificationChannel.sendMessage("Your cash on delivery payment was successful!");
    }
}
