package OOP.oop11_polymorphism;

public class NotificationDemo {

    public static void main(String[] args){

        Notification notification;

        notification = new EmailNotification();
        notification.send();

        notification = new SmsNotification();
        notification.send();

    }
}
