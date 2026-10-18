package ThreadsConcurrency.TimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class StudyReminder {

    public static void main (String[] args){

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int count = 3;
            @Override
            public void run(){
                System.out.println("Time to study German!");
                count --;

                if (count <=0){
                    System.out.println("Task Complete!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask, 1000, 1000);
    }
}
