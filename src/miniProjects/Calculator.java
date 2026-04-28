package miniProjects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){

        double num1;
        double num2 = 0;
        char operator;
        double result=0;
        boolean isValid=true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number:- ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+,-,/,*,^,r):- ");
        operator = scanner.next().charAt(0);

        if (operator == 'r') {
            result = Math.sqrt(num1);

        }
        else{
            System.out.print("Enter the 2nd number:- ");
            num2 = scanner.nextDouble();
        }
        switch(operator){

            case '+'-> result =num1 + num2;
            case '-'-> result =num1 - num2;
            case '*'-> result =num1 * num2;
            case '/'-> {
                if (num2==0){
                    System.out.println("You can't divide by 0!");
                    isValid = false;
                }
                else {
                    result =num1 / num2;
                }
            }
            case '^'-> result =Math.pow(num1,num2);
            case 'r'-> result = Math.sqrt(num1);
            default -> {
                System.out.println("you press in a wrong operator!");
                isValid = false;
            }
        }
        if (isValid){
            System.out.println(result);
        }

        scanner.close();
    }

}
