package OOP.oop03_arraysOfObjects;

import java.util.Scanner;

public class LaptopDemo {

    public static void main(String[]args){

        int amount;
        String brand;
        double laptopPrice;


        Scanner scanner = new Scanner(System.in);

        System.out.print("How many laptop?: ");
        amount = scanner.nextInt();
        scanner.nextLine();

        Laptop [] laptops = new Laptop[amount];

        for (int i = 0; i<amount; i++){
            System.out.println("\nLaptop "+(i+1));
            System.out.print("Enter brand: ");
            brand = scanner.nextLine();

            System.out.print("Enter price: ");
            laptopPrice = scanner.nextDouble();
            scanner.nextLine();

            laptops[i] = new Laptop(brand, laptopPrice);
        }

        System.out.println("\n========== Laptop List ==========\n");

        for (Laptop laptop: laptops){
            laptop.showDetails();
            System.out.println();
        }

        scanner.close();
    }
}
