package factory.abs;

import factory.impl.Notification;

public class SmsNotification implements Notification {
    @Override
    public void send() {
        System.out.println("This is SMS notification");
    }

    @Override
    public String format() {
        return null;
    }
}
