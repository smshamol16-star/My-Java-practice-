package OOP.oop16_wrapperClasses;

public class WrapperCalculator {

    public static void main(String[] args){

        Integer x = 10;
        Integer y = 2;

        System.out.println("===== Autoboxing =====");

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        int a = x;
        int b = y;

        System.out.println("===== Unboxing =====");

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
