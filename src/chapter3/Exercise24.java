package src.chapter3;

public class Exercise24 {

    public static void main(String[] args) {

        String[] strings = new String[3];
        Object[] objects = strings;
        objects[0] = "Length";
        String[] stringsAgain = (String[]) objects;

        System.out.println(strings[0] + ": " + stringsAgain.length);
    }
}