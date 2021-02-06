package com.example.sgkim94.item05;

public class PrintNotification implements Notification {
    public static final String PRINT_NOTIFY_MESSAGE = "Check Print!";

    @Override
    public String notifyToUser() {
        return PRINT_NOTIFY_MESSAGE;
    }
}
