package OOP.oop09_abstraction;

import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[]args){


        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a radius for circle: ");
        double radius = scanner.nextDouble();

        Shape s1 = new Circle(radius);
        s1.display();
        System.out.printf("Circle area: %.2f\n", s1.area());

        System.out.print("\nGive length for rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Give width for rectangle: ");
        double width = scanner.nextDouble();

        Shape s2 = new Rectangle(length, width);
        s2.display();
        System.out.printf("Rectangle area: %.2f\n", s2.area());

        scanner.close();

    }
}
