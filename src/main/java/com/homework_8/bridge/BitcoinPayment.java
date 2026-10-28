package com.homework_8.bridge;

public class BitcoinPayment extends Notification {
    public BitcoinPayment(NotificationChannel channel) {
        this.notificationChannel = channel;
    }

    public void sendNotification() {
        notificationChannel.sendMessage("Your bitcoin payment was successful!");
    }
}
