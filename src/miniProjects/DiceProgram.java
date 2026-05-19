package miniProjects;

import java.util.Random;
import java.util.Scanner;

public class DiceProgram {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberOfDice;
        int totalOfDice = 0;
        int rollDice ;

        System.out.print("Please enter the number of dice: ");
        numberOfDice  = scanner.nextInt();

        if (numberOfDice >0){

            for (int i = 0; i< numberOfDice;i++){

                rollDice = random.nextInt(1,7);
                printDice(rollDice);
                System.out.println("you rolled "+rollDice);


                totalOfDice +=rollDice;
            }
            System.out.println("***********");
            System.out.println("Total: "+totalOfDice);
            System.out.println("***********");
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }
        scanner.close();
    }
    static void printDice(int rollDice){

        String dice1 = """
                _____________
                |           |
                |     •     |
                |           |
                _____________
""" ;

        String dice2 = """
                _____________
                | •         |
                |           |
                |         • |
                _____________
 """;

        String dice3 ="""
                _____________
                | •         |
                |     •     |
                |         • |
                _____________
 """;

        String dice4 = """
                _____________
                | •      • |
                |          |
                | •      • |
                _____________
""";

        String dice5 ="""
                _____________
                | •      • |
                |     •    |
                | •      • |
                _____________
""";


        String dice6 ="""
                _____________
                | •       • |
                | •       • |
                | •       • |
                _____________
""";

        switch (rollDice){
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
            default ->  System.out.println("Invalid input. Please try again.");

        }
    }
}
