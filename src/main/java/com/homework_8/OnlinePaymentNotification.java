package com.homework_8;

public class OnlinePaymentNotification extends Notification {
    public OnlinePaymentNotification(NotificationChannel channel) {
        this.notificationChannel = channel;
    }

    public void sendNotification() {
        notificationChannel.sendMessage("Your online payment was successful!");
    }
}