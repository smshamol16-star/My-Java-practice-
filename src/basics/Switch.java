package basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[]args){

        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number amoung 1-12:- ");
        month = scanner.nextInt();
        switch (month){
            case 1-> System.out.println("January it has 31 days and this is Winter season.");
            case 2-> System.out.println("February it has 28 days and this is Winter season.");
            case 3-> System.out.println("March it has 31 days and this is Spring season.");
            case 4-> System.out.println("April it has 30 days and this is Spring season.");
            case 5-> System.out.println("May it has 31 days and this is Spring season.");
            case 6-> System.out.println("June it has 30 days and this is Summer season.");
            case 7-> System.out.println("July it has 31 days and this is Summer season.");
            case 8-> System.out.println("August it has 31 days and this is Summer season.");
            case 9-> System.out.println("September it has 30 days and this is Fall season.");
            case 10-> System.out.println("October it has 31 days and this is Fall season.");
            case 11-> System.out.println("November it has 30 days and this is Fall season.");
            case 12-> System.out.println("December it has 31 days and this is Winter season.");
            default -> System.out.println(month+" month not exist on earth");
        }
        scanner.close();

    }
}
