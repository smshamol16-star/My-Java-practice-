package OOP.oop10_interfaces;

public class SmsNotification implements Notification{

    @Override
    public void send(String message){

        System.out.println("SMS sent: "+message);

    }
}
