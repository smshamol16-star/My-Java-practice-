package loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[]args){

    // Easy:-

        int options;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Choose a number among(1-3):- ");
            options = scanner.nextInt();

            switch (options) {
                case 1 -> System.out.println("Hello!");
                case 2 -> System.out.println("Goodbye!");
                case 3 -> System.out.println("Exit!");
                default -> System.out.println("Invalid!");
            }

        }while (options!=3);

        scanner.close();


    // Mid:-

        int number = 0;
        int sum = 0;
        // There is a scanner above.

        while(number>=0){
            System.out.print("Enter a positive number:- ");
            number = scanner.nextInt();
            sum = sum +number;
        }

        System.out.println("The sum of all number that you have entered "+sum+".");


    //Hard:-

        int tried = 0;
        String password;
        // There is a scanner above.
        do{
            tried++;
            System.out.print("Enter the password:- ");
            password = scanner.nextLine();
        }while (!password.equals("Java123") && tried<3 );
        if (!password.equals("Java123")){
            System.out.println("Account locked!");
        }
        else {
            System.out.println("Wellcome!");
        }

        scanner.close();

    }
}
