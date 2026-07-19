package miniProjects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperOrScissorsGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        String userChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {

            System.out.print("Enter your move (rock, paper, scissors): ");
            userChoice = scanner.nextLine().toLowerCase();


            if (!userChoice.equals("rock") &&
                    !userChoice.equals("paper") &&
                    !userChoice.equals("scissors")) {

                System.out.println("Invalid input. Please enter rock, paper, or scissors.");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];

            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals(computerChoice)) {

                System.out.println("It's a tie!");

            } else if (
                    (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                            (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {

                System.out.println("You win!");

            } else {

                System.out.println("Computer wins!");

            }

            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("y"));

        System.out.println("\nThanks for playing!");

        scanner.close();
    }
}