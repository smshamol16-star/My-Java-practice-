package basics;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[]args){

        String name;
        String email;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name:- ");
        name = scanner.nextLine();

        System.out.print("Enter your E-mail address:- ");
        email = scanner.nextLine();

        System.out.println("Your full name is "+name.toUpperCase());

        System.out.println("Your first name is:- "+name.substring(0, name.indexOf(" ")));
        System.out.println("Your last name is:-"+name.substring(name.indexOf(" ")));

        System.out.println("Your user name is:- "+email.substring(0,email.indexOf("@")));
        System.out.println("Your domain name is:- "+email.substring(email.indexOf("@")+1));

        System.out.println("Your initials are "+name.substring(0, name.indexOf(" ")).charAt(0)+"."+name.substring(name.indexOf(" ")+1).charAt(0));

        scanner.close();

    }
}
