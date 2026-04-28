package miniProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[]args) {


        int randomNumber;
        int guess;
        int attempt = 0;


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        randomNumber = random.nextInt(1, 100 + 1);
        do {
            System.out.println("Chose a number between (1-100).");

            System.out.print("Enter the number that you have choosed:- ");
            guess = scanner.nextInt();

            if (guess<0){
                System.out.println("Invalid input.");
                continue;
            }
            else if (guess > randomNumber) {
                System.out.println("Too high.");
            } else if (guess < randomNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("You won.");
                System.out.println("I have taken " + attempt + " attempt.");
            }
            attempt++;

        } while (guess != randomNumber);

        }
    }
