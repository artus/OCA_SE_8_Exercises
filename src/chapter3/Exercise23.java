package src.chapter3;

public class Exercise23 {

    public static void main(String[] args) {

        String[] strings = new String[3];
        Object[] objects = strings;
        objects[0] = new StringBuilder("Hello");
        String[] stringsAgain = (String[]) objects;

        System.out.println(stringsAgain.length);
    }
}