package Basics;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[]args){

        String pass;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passowrd:- ");
        pass = scanner.nextLine();

        if (pass.length()>=8 && !pass.contains(" ")){
            System.out.println("Strong password!");
        } else if (pass.length()<8) {
            System.out.println("Password too short!");
        } else if (pass.contains(" ")) {
            System.out.println("Password can't contain spaces!");
        }
        scanner.close();
    }
}
