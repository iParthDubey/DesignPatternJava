package com.example.DesignPatterns.SimpleFactory.Notification;

public class SMSNotification implements Notification {
    @Override
    public void nofityUser() {
        System.out.println("Sending an SMS Notification");
    }
}
