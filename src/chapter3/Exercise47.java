package src.chapter3;

public class Exercise47 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2018, Month.JANUARY, 12);
        date.plusMonths(1);
        System.out.println(date.getMonth());
    }

}