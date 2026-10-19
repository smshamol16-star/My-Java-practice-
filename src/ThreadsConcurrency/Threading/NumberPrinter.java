package ThreadsConcurrency.Threading;

public class NumberPrinter implements Runnable{

    private final String name;


    NumberPrinter(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1000);
                System.out.println(name + ": "+ i);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}
