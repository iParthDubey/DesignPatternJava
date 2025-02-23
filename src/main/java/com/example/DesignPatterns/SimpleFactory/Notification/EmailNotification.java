package com.example.DesignPatterns.SimpleFactory.Notification;

public class EmailNotification implements Notification {
    @Override
    public void nofityUser() {
        System.out.println("Sending an Email Notification");
    }
}
