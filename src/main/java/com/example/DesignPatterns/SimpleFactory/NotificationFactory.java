package com.example.DesignPatterns.SimpleFactory;

import com.example.DesignPatterns.SimpleFactory.Notification.EmailNotification;
import com.example.DesignPatterns.SimpleFactory.Notification.Notification;
import com.example.DesignPatterns.SimpleFactory.Notification.SMSNotification;

public class NotificationFactory {

    public static Notification createNotification(String type){
        if(type.equalsIgnoreCase("Email")){
            return new EmailNotification();
        } else if( type.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }
        throw  new IllegalArgumentException("Unknown Notification type");
    }

}
