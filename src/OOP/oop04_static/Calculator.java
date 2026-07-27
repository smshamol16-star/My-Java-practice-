package OOP.oop04_static;

public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {

        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }

        return (double) a / b;
    }

}