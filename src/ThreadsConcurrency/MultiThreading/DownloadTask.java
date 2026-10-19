package ThreadsConcurrency.MultiThreading;

public class DownloadTask implements Runnable {

    private final String name;

    DownloadTask(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for(int i = 1; i <=5; i++){
            try {
                Thread.sleep(1000);
                System.out.println(name+" downloading : "+ i);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}