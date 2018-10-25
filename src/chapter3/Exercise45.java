package src.chapter3;

import java.time.*;

public class Exercise45 {

    public static void main(String[] args) {

        LocalDate date = new LocalDate(2018, Month.JANUARY, 12);
        date.plusMonths(1);
        System.out.println(date.getMonth());
    }

}