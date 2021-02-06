package com.example.sgkim94.item05;

public class NotificationFactory {
    public Notification getNotification(String type) {
        if ("SMS".equals(type)) {
            return new SMSNotification();
        }

        if ("Print".equals(type)) {
            return new PrintNotification();
        }

        if ("Security".equals(type)) {
            return new SecurityNotification();
        }

        if ("Timeout".equals(type)) {
            return new TimeoutNotification();
        }

        throw new IllegalArgumentException("Wrong Type!");
    }
}
