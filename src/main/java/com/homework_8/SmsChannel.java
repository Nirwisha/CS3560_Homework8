package com.homework_8;

public class SmsChannel implements NotificationChannel {
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}