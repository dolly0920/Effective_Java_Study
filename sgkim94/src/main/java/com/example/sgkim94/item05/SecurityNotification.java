package com.example.sgkim94.item05;

public class SecurityNotification implements Notification {
    public static final String SECURITY_NOTIFY_MESSAGE = "Check Security!";

    @Override
    public String notifyToUser() {
        return SECURITY_NOTIFY_MESSAGE;
    }
}
