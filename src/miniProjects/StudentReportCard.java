package miniProjects;

import java.util.Random;
import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[]args){


        int number1;
        int number2;
        int number3;
        int highestNumber;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name here:- ");
        name = scanner.nextLine().toUpperCase();
        System.out.println("Hello "+name);
        System.out.print("Enter 1st subject number that you have got:- ");
        number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter 2nd subject number that you have got:- ");
        number2 = scanner.nextInt();
        System.out.print("Enter 3rd subject number that you have got:- ");
        number3 = scanner.nextInt();

        double average = (number1+number2+number3)/3.0;
        System.out.println("The average number is "+average+".");

        if (average>=90){
            System.out.println("You have got A.");
        } else if (average>=80) {
            System.out.println("You have got B.");
        }
        else if (average>=70) {
            System.out.println("You have got C.");
        }
        else if (average>=60) {
            System.out.println("You have got D.");
        }
        else {
            System.out.println("You have got F.");
        }

        highestNumber =Math.max(Math.max(number1,number2),number3);
        System.out.println("Your highest number is "+highestNumber);
        Random random = new Random();
        int luckyNumber = random.nextInt(100) + 1;
        System.out.println("Your lucky number is " +luckyNumber+".");

        scanner.close();

    }
}