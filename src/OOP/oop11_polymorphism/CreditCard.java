package OOP.oop11_polymorphism;

public class CreditCard extends PaymentMethod{

    @Override
    void pay(){
        System.out.println("Paid using Credit Card");

    }
}
