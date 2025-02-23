package com.example.DesignPatterns.SimpleFactory;

import com.example.DesignPatterns.SimpleFactory.Notification.Notification;

public class FactoryPatternExample {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        notification.nofityUser();
    }

}
