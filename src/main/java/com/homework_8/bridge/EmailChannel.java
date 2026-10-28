package com.homework_8.bridge;

public class EmailChannel implements NotificationChannel {
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
