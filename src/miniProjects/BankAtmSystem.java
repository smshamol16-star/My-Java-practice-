package miniProjects;

import java.util.Scanner;

public class BankAtmSystem {
    public static void main (String[]args){

        String name;
        int pin ;
        double balance=50000.00;
        double amount;
        double remaining;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name:- ");
        name = scanner.nextLine();

        System.out.print("What is PIN:- ");
        pin = scanner .nextInt();

        if (pin != 4321){
            System.out.println("Worng PIN! Access denied.");
        }
        else {
            System.out.println("Your balance is "+ balance);
            System.out.print("How much tk do you want to withdrawal?-");
            amount = scanner.nextDouble();

            if (amount<=0) {
                System.out.println("Invalid amount!");
            }
            else if (amount > balance){
                System.out.println("Insufficent funds!");
            }
            else{
                remaining = balance-amount;
                System.out.println("Withdrawal successful! Remaining balance: "+remaining);
            }
        }
    }
}
