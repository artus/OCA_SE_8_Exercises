package src.chapter3;

public class Exercise10 {

    public static void main(String[] args) {

        String string = "copy me";
        String New = "";

        for (int i = 0; i < string.length; i++) {
            New += string.charAt(i);
        }

        System.out.println(New);
    }
}