package src.chapter3;

public class Exercise21 {

    public static void main(String[] args) {

        String[] strings = new String[3];
        Object[] objects = strings;
        String[] stringsAgain = objects;

        System.out.println(stringsAgain.length);
    }
}