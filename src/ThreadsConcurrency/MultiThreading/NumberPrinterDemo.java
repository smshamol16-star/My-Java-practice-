package ThreadsConcurrency.MultiThreading;

public class NumberPrinterDemo {

    public static void main(String[] args){

        NumberPrinter numberPrinter1 = new NumberPrinter("Task-1");
        NumberPrinter numberPrinter2 = new NumberPrinter("Task-2");

        System.out.println("====== Task Starting ======");

        Thread thread1 = new Thread(numberPrinter1);
        Thread thread2 = new Thread(numberPrinter2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Task complete");
    }
}
