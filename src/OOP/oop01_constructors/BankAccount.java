package OOP.oop01_constructors;

public class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {

        this.accountHolder = accountHolder;
        this.balance = balance;

    }

    void deposit(double amount) {

        balance += amount;

        System.out.println("Deposited: " + amount);

    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("Withdrawn: " + amount);

        } else {

            System.out.println("Insufficient Balance!");

        }

    }

    void showBalance() {

        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);

    }

}