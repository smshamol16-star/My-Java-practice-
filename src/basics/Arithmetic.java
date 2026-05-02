package basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[]args){

        double num1;
        double num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number:- ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the 2nd number:- ");
        num2 = scanner.nextDouble();

        System.out.println("The plus result of those numbers is:- "+(num1+num2));
        System.out.println("The Minus result of those numbers is:- "+(num1-num2));
        System.out.println("The Multiplication result of those numbers is:- "+(num1*num2));
        System.out.println("The Divide result of those numbers is:- "+(num1/num2));
        System.out.println("The Mod result of those numbers is:- "+(num1%num2));
        System.out.println("The Power result of those numbers is:- "+Math.pow(num1,num2));
        System.out.println("The Square root result of those numbers is :- 1st: "+Math.sqrt(num1)+", 2nd: "+Math.sqrt(num2));

        scanner.close();

    }
}
