package com.example.sgkim94.item04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NotificationFactoryTest {
    private final NotificationFactory notificationFactory = new NotificationFactory();

    @Test
    @DisplayName("SMS의 Notify 가 발송되는지")
    void getNotificationToSMS() {
        Notification notification = notificationFactory.getNotification("SMS");

        assertThat(notification.notifyToUser()).isEqualTo("Check SMS!");
    }

    @Test
    @DisplayName("Print의 Notify 가 발송되는지")
    void getNotificationToPrint() {
        Notification notification = notificationFactory.getNotification("Print");

        assertThat(notification.notifyToUser()).isEqualTo("Check Print!");
    }

    @Test
    @DisplayName("Timeout의 Notify 가 발송되는지")
    void getNotificationToTimeout() {
        Notification notification = notificationFactory.getNotification("Print");

        assertThat(notification.notifyToUser()).isEqualTo("Check Print!");
    }

    @Test
    @DisplayName("Security의 Notify 가 발송되는지")
    void getNotificationToSecurity() {
        Notification notification = notificationFactory.getNotification("Security");

        assertThat(notification.notifyToUser()).isEqualTo("Check Security!");
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
