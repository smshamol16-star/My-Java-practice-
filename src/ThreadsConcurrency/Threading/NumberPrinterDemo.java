package ThreadsConcurrency.Threading;

public class NumberPrinterDemo {

    public static void main(String[] args){

        Thread thread = new Thread(new NumberPrinter("My-Thread"));

        thread.start();
        try{
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("Task Complete!");
    }
}
