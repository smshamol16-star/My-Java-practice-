package loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[]args){

        int options;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Choose a number among(1-3):- ");
            options = scanner.nextInt();

            switch (options) {
                case 1 -> System.out.println("Hello!");
                case 2 -> System.out.println("Goodbye!");
                case 3 -> System.out.println("Exit!");
                default -> System.out.println("Invalid!");
            }

        }while (options!=3);

        scanner.close();

    }
}
