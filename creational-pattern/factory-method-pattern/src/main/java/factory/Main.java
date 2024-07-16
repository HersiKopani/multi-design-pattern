package factory;

import factory.impl.Notification;
import factory.impl.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory pattern");
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotificationFactory("SMS");
        notification.format();
        notification.send();
    }
}