package miniProjects;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        String [] questions = { "What is the main function of router?",
                                "Which part of cumputer is considerd the brain of computer",
                                "What year was facbook launched?",
                                "Who is known as the father of computer?",
                                "What is the first programming language?"};

        String [][] answers = { {"1. Stornig fiels", "2. Enrypting Data", "3. Directing internet traffic", "4. Managing passwords"},
                                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                                {"1. Steve Jobs", "2. Bill Gates", "3. Alen Turing", "4. Charles Babbage"},
                                {"1. CCOBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int [] correctAnswers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess = 0;

        System.out.println("*************************");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("*************************");

        for(int i = 0; i<questions.length; i++) {
            System.out.println(questions[i]);

            for( String answer : answers[i]) {
                    System.out.println(answer);
            }
            System.out.print("Enter your guess "+(i+1)+" :");
            guess = scanner.nextInt();
            scanner.nextLine();

            if (guess == correctAnswers[i]) {
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("********");
                System.out.println("Wrong!");
                System.out.println("********");
            }
        }

        System.out.println("*****************************");
        System.out.println("Your final score is: " + score);
        System.out.println("*****************************");

        scanner.close();
    }
}
