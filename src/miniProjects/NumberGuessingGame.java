package miniProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[]args){

                int guessNumber;
                int randomNumber;
                int attempt = 0;

                Random random = new Random();
                randomNumber = random.nextInt(1,100+1);

                Scanner scanner = new Scanner(System.in);

                do{
                    attempt++;
                    System.out.println("Guess a number among(1-100)");
                    System.out.print("Enter the number that you have choosed:- ");
                    guessNumber = scanner.nextInt();


                    if (guessNumber>randomNumber){
                        System.out.println("Too high");
                    } else if (guessNumber<randomNumber) {
                        System.out.println("Too low");
                    }
                    else {
                        System.out.println("Correct! You got it in " +attempt+" attempts!");
                    }

                }while (guessNumber!=randomNumber && attempt<=7);
                if (guessNumber != randomNumber) {
                    System.out.println("Game over! The number was " + randomNumber);
                }

                scanner.close();

            }
        }


