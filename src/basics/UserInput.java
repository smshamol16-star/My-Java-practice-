package basics;


import java.util.Scanner;

public class UserInput {
    public static void main(String[]args){

        String name;
        int age;
        String email;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name??:- ");
        name = scanner.nextLine();

        System.out.print("Enter your age:- ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter you E-mail here:- ");
        email = scanner.nextLine();

        System.out.println("Your name is "+name+".");
        System.out.println("You are "+age+" years old.");
        System.out.println("Your E-mail is "+email+".");

        scanner.close();

    }
}
