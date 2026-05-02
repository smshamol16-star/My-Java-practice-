package basics;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[]args){

//  1st:     Even or Odd checker

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        number = scanner.nextInt();

        String isEvenOrOdd = (number%2 == 0) ? "Even" : "Odd";
        System.out.println("Your provided number is "+isEvenOrOdd);


        

//  2nd:     Age Status checker

        int age ;

//      There is already a scanner variable above
        System.out.print("Enter your age:- ");
        age = scanner.nextInt();

        String isAudltOrMinor = (age>=18) ? "Adult" : "Minor";

        System.out.println(isAudltOrMinor);

        scanner.close();

    }
}
