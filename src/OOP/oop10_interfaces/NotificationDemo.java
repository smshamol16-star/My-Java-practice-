package OOP.oop10_interfaces;

public class NotificationDemo {
    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification(),
                new SmsNotification()
        };

        for (Notification notification : notifications) {
            notification.send("Your OTP number is 25804");
        }
    }
}
