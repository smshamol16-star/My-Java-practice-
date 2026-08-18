package OOP.oop11_polymorphism;

public class EmailNotification extends Notification{

    @Override
    void send(){
        System.out.println("Email notification sent");

    }
}
