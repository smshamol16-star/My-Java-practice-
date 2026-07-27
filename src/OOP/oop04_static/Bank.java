package OOP.oop04_static;

public class Bank {

    static String bankName = "ABC Bank";
    String accountHolder;
    double balance;

    Bank (String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void displayAccount(){

        System.out.println("Bank: "+bankName);
        System.out.println("Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
        System.out.println();

    }
}
