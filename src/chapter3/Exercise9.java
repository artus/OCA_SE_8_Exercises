package src.chapter3;

public class Exercise9 {

    public static void main(String[] args) {

        String string = "copy";
        String New = "";

        for (int i = 0; i < string.length(); i++) {
            New += string.charAt(i);
        }

        System.out.println(New);
    }
}