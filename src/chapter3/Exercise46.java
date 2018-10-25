package src.chapter3;

import java.time.*;

public class Exercise46 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, Month.JANUARY, 12);
        date.plusMonths(1);
        System.out.println(date.getMonth());
    }

}