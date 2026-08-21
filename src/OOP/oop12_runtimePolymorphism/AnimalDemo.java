package OOP.oop12_runtimePolymorphism;

import java.util.Scanner;

public class AnimalDemo {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Choose a animal between cat and dog (1: Cat, 2: Dog): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Cat();
        }
        else if (choice == 2) {
            animal = new Dog();
        }
        else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        animal.sound();
        scanner.close();

    }
}
