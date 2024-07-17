package factory.impl;

import factory.abs.ProfileUpdateNotification;
import factory.abs.SmsNotification;

public class NotificationFactory {
    public Notification createNotificationFactory(String notificationType){
        if(notificationType.contentEquals("SMS")){
            return new SmsNotification();
        }else return new ProfileUpdateNotification();
    }
}
