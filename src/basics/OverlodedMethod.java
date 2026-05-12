package basics;

public class OverlodedMethod {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 4;
        double x = 3.0;
        double y = 4.0;

        System.out.println(multiply(a, b));
        System.out.println(multiply(a, b, c));
        System.out.println(multiply(x, y));

    }

    static int multiply(int a, int b) {
        return a * b;
    }
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    static double multiply(double a, double b) {
        return a * b ;
    }
}
