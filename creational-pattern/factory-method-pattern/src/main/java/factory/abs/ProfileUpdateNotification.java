package factory.abs;

import factory.impl.Notification;
import factory.impl.NotificationFactory;

public class ProfileUpdateNotification extends NotificationFactory implements Notification {
    @Override
    public void send() {
        System.out.println("This is notification for profile update");
    }

    @Override
    public String format() {
        return "Profile Update: Your profile has been updated";
    }

    public void getProfile(){
        System.out.println("Get profile ");
    }
}
