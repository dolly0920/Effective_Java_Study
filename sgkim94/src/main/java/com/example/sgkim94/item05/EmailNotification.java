package com.example.sgkim94.item05;

public class EmailNotification implements Notification {
    @Override
    public String notifyToUser() {
        return "Check Email!";
    }
}
