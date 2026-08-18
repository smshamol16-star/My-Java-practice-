package OOP.oop11_polymorphism;

public class SmsNotification extends Notification{

    @Override
    void send(){
        System.out.println("SMS notification sent");

    }
}
