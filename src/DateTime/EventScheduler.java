package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EventScheduler {

    public static void main (String[] args){

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDate eventDate = LocalDate.of(2026, 11, 25);
        LocalTime eventTime = LocalTime.of(14, 30);
        LocalDateTime dateTime = LocalDateTime.of(eventDate, eventTime);

        System.out.println("Today's Date: "+ date);
        System.out.println("Current Time: "+ time);
        System.out.println("Event Date: "+ eventDate);
        System.out.println("Event Time: "+ eventTime);
        System.out.println("Event Date & Time: "+ dateTime);

    }
}
