package src.chapter3;

import java.time.*;

public class Exercise49 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, 1 ,1);
        LocalTime time = LocalTime.of(1, 1);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period monthsPeriod = Period.of(1, 1, 1);

        date.plus(monthsPeriod);
        dateTime.plus(monthsPeriod);

        System.out.println(time);
    }

}