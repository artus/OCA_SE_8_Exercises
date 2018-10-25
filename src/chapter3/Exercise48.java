package src.chapter3;

public class Exercise48 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, 1 ,1);
        LocalTime time = LocalTime.of(1);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period monthsPeriod = Period.ofMonths(1);

        date.plus(monthsPeriod);
        dateTime.plus(monthsPeriod);
        time.plus(monthsPeriod);
    }

}