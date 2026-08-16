package OOP.oop10_interfaces;

public class PaymentDemo {
    public static void main (String[]args){

        Paypal paypal = new Paypal();
        Bkash bkash = new Bkash();
        Nagad nagad = new Nagad();

        paypal.pay(500.0);
        System.out.println();
        bkash.pay(1000.0);
        System.out.println();
        nagad.pay(2000.0);

    }
}
