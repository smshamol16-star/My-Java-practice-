package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        challenge1();
        challenge2();
        challenge3();
        challenge4();

    }
    static void challenge1(){
        int [] marks = new int[5];

        for(int i = 0; i<5; i++){
            System.out.print("Enter marks "+(i+1)+": ");
            marks[i]=scanner.nextInt();
        }
        for (int i = 0; i<5; i++){
            System.out.println("****");
            System.out.println(marks[i]);
        }
       scanner.close();

    }
    static void challenge2(){

        int[]num ;
        int input;
        System.out.print("How many numbers do you want to enter: ");
        input = scanner.nextInt();
        scanner.nextLine();

        num= new int[input];

        for(int i = 0; i<input; i++){
            System.out.print("Enter number "+(i+1)+": ");
            num[i]=scanner.nextInt();
        }

        int max=num[0];

        for(int i = 0; i<input; i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Max: "+max);
        scanner.close();



    }
    static void challenge3(){
        int [] num;
        int input;
        System.out.print("How many numbers do you want to enter: ");
        input = scanner.nextInt();
        scanner.nextLine();

        num = new int[input];
        for(int i = 0; i<input; i++){
            System.out.print("Enter number "+(i+1)+": ");
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        for(int i = 0; i<input; i++){
            System.out.println(num[i]);
        }

        scanner.close();
    }
    static void challenge4(){

        String name;
        String[]names = {"shamol","Jon","Siam","Mehrab","Mahadi"};

        System.out.print("Enter the name that you want to search for: ");
        name = scanner.nextLine();

        boolean found = false;
        for(int i = 0; i<names.length; i++){
            if(name.equals(names[i])){
                found = true;
                System.out.println("Match found");
                break;
            }
        }
        if (!found){
            System.out.println("Match not found");
        }
        scanner.close();
    }
}
