package OOP.oop11_polymorphism;

public class PaymentMethodDemo {
    public static void main(String[]args){

        PaymentMethod payment;

        payment = new CreditCard();
        payment.pay();

        payment = new CashPayment();
        payment.pay();

    }
}
