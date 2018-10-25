package src.chapter3;

public class Exercise32 {

    public static void main(String[] args) {

        String[] strings = new String[3];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = "hip ";
        }

        for (String string : strings) {
            System.out.print(string);
        }

        System.out.print(" Hurray!");
    }
}