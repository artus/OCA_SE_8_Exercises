package src.chapter2;

public class Exercise14 {

    public static void main(String[] args) {

        String test = "hello";

        String option1 = "option1";
        String option2 = "option2";

        switch(test) {

            case option1:
                System.out.println("2");
                break;

            case option2:
                System.out.println("1");
                break;

            default:
                System.out.println("default");
        }
    }
}