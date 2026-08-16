package OOP.oop10_interfaces;

public class Nagad implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Paid "+amount+" using Nagad");

    }
}
