package observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<EventListener> customers;

    public NotificationService() {
        this.customers = new ArrayList<>();
    }

    public void subscribe(EventListener listener) {
       customers.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        customers.remove(listener);
    }

    public void notifyAllListeners() {
        customers.forEach(listener -> listener.update());
    }
}