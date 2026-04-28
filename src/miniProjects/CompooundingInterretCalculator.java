package miniProjects;

import java.util.Scanner;

public class CompooundingInterretCalculator {
    public static void main(String[]args){

        double presentValue;
        double rate;
        int interasteTime;
        int year;
        double futureValue;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your present value here please:- ");
        presentValue = scanner.nextDouble();

        System.out.print("Enter the rate here please, in %:- ");
        rate = scanner.nextDouble()/100;

        System.out.print("Tell us the compund time please:- ");
        interasteTime = scanner.nextInt();

        System.out.print("Tell us for how much year you want to invest- ");
        year = scanner.nextInt();

        futureValue =  presentValue * Math.pow(1 + rate / interasteTime, year * interasteTime);
        System.out.printf("Your future value will be:- %.2f ",futureValue);

        scanner.close();
    }
}
