package ThreadsConcurrency.MultiThreading;

public class NumberPrinter implements Runnable{

    private final String name;

    NumberPrinter(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
            System.out.println(name+": "+ i);
        }
    }
}
