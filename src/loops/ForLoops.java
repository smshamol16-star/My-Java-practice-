package loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[]args){

    //Easy:-

        for (int i=2 ;i<=50 ;i+=2 ){
            System.out.println("Those are the even numbers among 1-50:- ");
            System.out.println(i);
        }


    //Mid:-

        int tableNumber;
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number whose table you want:- ");
        tableNumber = scanner.nextInt();

        System.out.println("The table of "+tableNumber+" is:- ");

        for (int i = 1 ;i<=10 ;i++ ){
            result = tableNumber*i;
            System.out.println(tableNumber+ "x"+ i+"="+result);
        }


    //Hard:-

        int factorialNumber;
        int result1 = 1;//There is a result above.
        String formula ="";

        // There is a scanner above.
        System.out.print("Enter a number whose factorial you want:- ");
        factorialNumber = scanner.nextInt();

        for (int i = factorialNumber; i>0;i-- ){
            result1 = result1*i;

            if (i==1){
                formula+=i;
            }
            else {
                formula+=i+"x";
            }

        }
        System.out.println(formula + " = " + result1);

        scanner.close();

    }
}
