package ExceptionHandling;

public class DivisionCalculator {

    public static void main (String[] args){

        int num1 = 20;
        int num2 = 0; // ** Use here 0 **

        try {
            System.out.println("Result: "+ num1/num2);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
        finally {
            System.out.println("Calculator finished.");
        }
    }
}
