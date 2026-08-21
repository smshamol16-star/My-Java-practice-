package OOP.oop12_runtimePolymorphism;

import java.util.Scanner;

public class PaymentDemo {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        Payment payment;

        System.out.print("Which method you want to use? 1: Bkash, 2: Card: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1){
            payment = new Bkash();
        } else if (choice == 2) {
            payment = new Card();
        }
        else{
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        System.out.print("How much money do you want to pay?: ");
        double amount = scanner.nextDouble();

        if(amount <=0){
            System.out.println("You can't pay negative amount");
            scanner.close();
            return;
        }

        payment.pay(amount);
        scanner.close();
    }
}
