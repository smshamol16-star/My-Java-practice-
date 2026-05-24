package miniProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        int guessNumber;
        int randomNumber;
        int attempt = 0;
        int maxAttempts = 7;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        randomNumber = random.nextInt(1, 101);

        System.out.println("***** Number Guessing Game***** ");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.\n");

        do {

            System.out.print("Enter your guess: ");
            guessNumber = scanner.nextInt();

            // Input validation
            if (guessNumber < 1 || guessNumber > 100) {
                System.out.println("Please enter a number between 1 and 100.\n");
                continue;
            }

            attempt++;

            // Correct guess
            if (guessNumber == randomNumber) {

                System.out.println("\nCorrect! 🎉");
                System.out.println("You guessed the number in " + attempt + " attempts.");

            }

            // Very close
            else if (Math.abs(guessNumber - randomNumber) <= 5) {

                if (guessNumber > randomNumber) {
                    System.out.println("Very close! Slightly high.\n");
                } else {
                    System.out.println("Very close! Slightly low.\n");
                }

            }

            // Too high
            else if (guessNumber > randomNumber) {

                System.out.println("Too high!\n");

            }

            // Too low
            else {

                System.out.println("Too low!\n");

            }

        } while (guessNumber != randomNumber && attempt < maxAttempts);

        // Lose condition
        if (guessNumber != randomNumber) {

            System.out.println("\nGame Over! ❌");
            System.out.println("The correct number was: " + randomNumber);

        }

        scanner.close();
    }
}