package ThreadsConcurrency.Threading;

import java.util.Scanner;

public class UsersNameTaking {

    public static void main(){

        Scanner scanner = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);

        scanner.close();

    }
}
