package basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Easy:


        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + add(num1, num2));

        // Mid:

        // There is a scanner above.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        oddOrEven(number);

        scanner.close();
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}