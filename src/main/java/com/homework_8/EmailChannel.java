package com.homework_8;

public class EmailChannel implements NotificationChannel {
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}
