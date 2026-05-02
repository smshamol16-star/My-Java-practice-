package basics;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[]args) {

        int age;
        double income;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:- ");
        age = scanner.nextInt();

        System.out.print("Enter your yearly income:- ");
        income = scanner.nextDouble();

        if (age<18){
            System.out.println("You are not eligible for tax.");
        } else if (income>60000) {
            System.out.println("Tax 42%.");
        } else if (income<=10000) {
            System.out.println("Tax 0%.");
        } else if (income<=30000) {
            System.out.println("Tax 14%.");
        }else if (income<=60000){
            System.out.println("Tax 30%.");
        }
        scanner.close();

    }
}
