package com.homework_8;

public abstract class Notification {
    protected NotificationChannel notificationChannel; //connection to notificationchannel

    public abstract void sendNotification();
}