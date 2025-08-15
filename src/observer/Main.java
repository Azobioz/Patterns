package observer;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.getNotificationService().subscribe(
                new EmailMsgListener("ben1243@gmail.com")
        );
        store.getNotificationService().subscribe(
                new EmailMsgListener("tom1243@gmail.com")
        );
        store.getNotificationService().subscribe(
                new MobileAppListener("andrew123")
        );
        store.sendStoreNotification();
    }
}
