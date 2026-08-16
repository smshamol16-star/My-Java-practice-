package OOP.oop10_interfaces;

public class Bkash implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Paid "+amount+" using Bkash");

    }
}


