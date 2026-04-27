package miniProjects;

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[]args){
        int option;
        double weight1;
        double weight2;
        System.out.println(" Weight conversion Program");
        System.out.println(" 1: Convert lbs to kgs");
        System.out.println(" 2: Convert kgs to lbs");

        Scanner scanner =  new Scanner(System.in);
        System.out.print("Choose an opption 1 or 2 :- ");
        option = scanner.nextInt();
        scanner.nextLine();



        if (option ==1){
            System.out.print("Enter the the weight in lbs:- ");
            weight1 = scanner.nextDouble();
            System.out.printf("The new weight in kgs is %.2f.",weight1*0.45359);
        } else if (option == 2) {
            System.out.print("Enter the weight in kgs:- ");
            weight2 = scanner.nextDouble();
            System.out.printf("The new weight in lbs is %.2f.", weight2*2.20462);
        }
        else{
            System.out.print("There is a problem you choose a wrong option \"3\".");
        }

        scanner.close();
    }
}

