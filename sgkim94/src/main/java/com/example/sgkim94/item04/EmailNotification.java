package com.example.sgkim94.item04;

public class EmailNotification implements Notification {
    @Override
    public String notifyToUser() {
        return "Check Email!";
    }
}
