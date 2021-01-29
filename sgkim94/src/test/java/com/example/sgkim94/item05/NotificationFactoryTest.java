package com.example.sgkim94.item05;

import com.example.sgkim94.item05.Notification;
import com.example.sgkim94.item05.NotificationFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.sgkim94.item05.PrintNotification.PRINT_NOTIFY_MESSAGE;
import static com.example.sgkim94.item05.SMSNotification.SMS_NOTIFY_MESSAGE;
import static com.example.sgkim94.item05.SecurityNotification.SECURITY_NOTIFY_MESSAGE;
import static com.example.sgkim94.item05.TimeoutNotification.TIMEOUT_NOTIFY_MESSAGE;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NotificationFactoryTest {
    private final NotificationFactory notificationFactory = new NotificationFactory();

    @Test
    @DisplayName("SMS의 Notify 가 발송되는지")
    void getNotificationToSMS() {
        Notification notification = notificationFactory.getNotification("SMS");

        assertThat(notification.notifyToUser()).isEqualTo(SMS_NOTIFY_MESSAGE);
    }

    @Test
    @DisplayName("Print의 Notify 가 발송되는지")
    void getNotificationToPrint() {
        Notification notification = notificationFactory.getNotification("Print");

        assertThat(notification.notifyToUser()).isEqualTo(PRINT_NOTIFY_MESSAGE);
    }

    @Test
    @DisplayName("Timeout의 Notify 가 발송되는지")
    void getNotificationToTimeout() {
        Notification notification = notificationFactory.getNotification("Timeout");

        assertThat(notification.notifyToUser()).isEqualTo(TIMEOUT_NOTIFY_MESSAGE);
    }

    @Test
    @DisplayName("Security의 Notify 가 발송되는지")
    void getNotificationToSecurity() {
        Notification notification = notificationFactory.getNotification("Security");

        assertThat(notification.notifyToUser()).isEqualTo(SECURITY_NOTIFY_MESSAGE);
    }

    @Test
    @DisplayName("Another Notify 발송 시 예외처리가 되는지")
    void getNotificationToAnother() {
        String errorMessage = assertThrows(IllegalArgumentException.class, () -> {
            notificationFactory.getNotification("TV");
        }).getMessage();

        assertThat(errorMessage).isEqualTo("Wrong Type!");
    }
}
