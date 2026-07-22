package OOP.oop01_constructors;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[]args){

        Scanner scanner =  new Scanner(System.in);

        System.out.print("Student 1: ");

        System.out.print("Enter Name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Department: ");
        String department1 = scanner.nextLine();

        Student student1 = new Student(name1, age1, department1);

        System.out.println("");

        System.out.print("Student 2: ");

        System.out.print("Enter Name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Department: ");
        String department2 = scanner.nextLine();

        Student student2 = new Student(name2, age2, department2);

        System.out.println("\n========== Students ==========\n");

        student1.introduce();

        System.out.println("");

        student2.introduce();

        scanner.close();
    }
}
