package OOP.oop12_runtimePolymorphism;

public class Bkash extends Payment{

    @Override
    void pay(double amount){
        System.out.println("Paid "+amount+" using Bkash");

    }
}
