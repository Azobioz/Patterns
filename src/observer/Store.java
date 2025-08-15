package observer;

import javax.management.Notification;

public class Store {
    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void sendStoreNotification() {
        System.out.println("В магазине появилось что-то");
        notificationService.notifyAllListeners();
    }
}
