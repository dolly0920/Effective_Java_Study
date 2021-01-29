package com.example.sgkim94.item05;

public class SMSNotification implements Notification {
    public static final String SMS_NOTIFY_MESSAGE = "Check SMS!";

    @Override
    public String notifyToUser() {
        return SMS_NOTIFY_MESSAGE;
    }

}
