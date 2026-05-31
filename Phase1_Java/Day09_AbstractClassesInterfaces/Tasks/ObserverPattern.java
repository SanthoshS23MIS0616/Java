/*
Question:
How can you create EventPublisher with List<EventListener>, OrderService publishing OrderCreated event, and EmailService/SMSService implementing EventListener?
*/
import java.util.ArrayList;
import java.util.List;

interface EventListener {
    void onEvent(String event);
}

class EventPublisher {
    private List<EventListener> listeners = new ArrayList<>();

    void addListener(EventListener listener) {
        listeners.add(listener);
    }

    void publish(String event) {
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }
    }
}

class EmailService implements EventListener {
    public void onEvent(String event) {
        System.out.println("Email sent for " + event);
    }
}

class SMSService implements EventListener {
    public void onEvent(String event) {
        System.out.println("SMS sent for " + event);
    }
}

class OrderService {
    private EventPublisher publisher;

    OrderService(EventPublisher publisher) {
        this.publisher = publisher;
    }

    void createOrder(String orderId) {
        System.out.println("Order created: " + orderId);
        publisher.publish("OrderCreated: " + orderId);
    }
}

class ObserverPattern {
    public static void main(String[] args) {
        EventPublisher publisher = new EventPublisher();
        publisher.addListener(new EmailService());
        publisher.addListener(new SMSService());

        OrderService orderService = new OrderService(publisher);
        orderService.createOrder("ORD101");
    }
}
