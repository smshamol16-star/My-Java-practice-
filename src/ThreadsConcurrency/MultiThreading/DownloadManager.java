package ThreadsConcurrency.MultiThreading;

public class DownloadManager {

    public static void main(String[] args){

        Thread thread1 = new Thread(new DownloadTask("File-A"));
        Thread thread2 = new Thread(new DownloadTask("File-B"));

        thread1.start();
        thread2.start();
    }
}
