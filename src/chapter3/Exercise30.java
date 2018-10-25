package src.chapter3;

public class Exercise30 {

    public static void main(String[] args) {

        String... strings = new String[3];

        for (String string : strings) {
            string = "hip ";
        }

        for (String string : strings) {
            System.out.print(string);
        }

        System.out.print(" Hurray!");
    }
}