package com.homework_8.bridge;

public class PushChannel implements NotificationChannel {
    public void sendMessage(String message) {
        System.out.println("Push: " + message);
    }
}
