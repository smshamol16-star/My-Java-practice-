package OOP.oop01_constructors;

import java.util.Scanner;

public class BankAccountDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Holder: ");
        String name = scanner.nextLine();

        System.out.print("Enter Opening Balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, balance);

        System.out.println();

        account.showBalance();

        System.out.println();

        System.out.print("Deposit Amount: ");
        double deposit = scanner.nextDouble();

        account.deposit(deposit);

        account.showBalance();

        System.out.println();

        System.out.print("Withdraw Amount: ");
        double withdraw = scanner.nextDouble();

        account.withdraw(withdraw);

        account.showBalance();

        scanner.close();

    }

}