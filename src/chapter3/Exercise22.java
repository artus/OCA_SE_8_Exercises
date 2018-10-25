package src.chapter3;

public class Exercise22 {

    public static void main(String[] args) {

        String[] strings = new String[3];
        Object[] objects = strings;
        String[] stringsAgain = (String[]) objects;

        System.out.println(stringsAgain.length);
    }
}