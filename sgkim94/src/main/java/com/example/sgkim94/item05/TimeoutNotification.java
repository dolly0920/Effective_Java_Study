package com.example.sgkim94.item05;

public class TimeoutNotification implements Notification {
    public static final String TIMEOUT_NOTIFY_MESSAGE = "Check Time!";

    @Override
    public String notifyToUser() {
        return TIMEOUT_NOTIFY_MESSAGE;
    }

}
