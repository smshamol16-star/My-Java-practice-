package basics;

import java.util.Scanner;

public class TwoDArrays {
    static Scanner scanner = new Scanner(System.in);
    public  static void main(String[]args){

        challange1();


    }
    static void challange1(){

        int inputnum;
        int inputnum1;
        int inputnum2;
        String[] category = {
                "Fruits",
                "Vegetables",
                "Meat"
        };


        System.out.print("Tell me how many fruits do you want: ");
        inputnum = scanner.nextInt();
        scanner.nextLine();
        String[] fruits = new String[inputnum];

        for(int i = 0;i<fruits.length;i++){
            System.out.print("Enter friut "+(i+1)+": ");
            fruits[i] = scanner.nextLine();
        }
        System.out.println("*****************************************");
        System.out.print("\nTell me how many vegetables do you want: ");
        inputnum1 = scanner.nextInt();
        scanner.nextLine();
        String[] vegetables = new String[inputnum1];

        for(int i = 0;i<vegetables.length;i++){
            System.out.print("Enter vegetables "+(i+1)+": ");
            vegetables[i] = scanner.nextLine();
        }
        System.out.println("***********************************");
        System.out.print("\nTell me how many meet do you want: ");
        inputnum2 = scanner.nextInt();
        scanner.nextLine();
        String[] meat = new String[inputnum2];

        for(int i = 0;i<meat.length;i++){
            System.out.print("Enter meat "+(i+1)+": ");
            meat[i] = scanner.nextLine();
        }


        String [][] groceries = {fruits,vegetables,meat};

        for(int i = 0; i < groceries.length; i++) {

            System.out.println("\n" + category[i] + ":");

            for (int j = 0; j < groceries[i].length; j++) {

                System.out.print(groceries[i][j] + " ");

            }

            System.out.println();

        }
        scanner.close();
    }
    static void challange2(){



    }


}
