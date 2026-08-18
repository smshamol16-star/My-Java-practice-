package OOP.oop11_polymorphism;

public class CashPayment extends PaymentMethod{

    @Override
        void pay(){
        System.out.println("Paid using Cash");

    }
}
