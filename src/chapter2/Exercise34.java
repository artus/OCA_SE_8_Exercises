package src.chapter2;

public class Exercise34 {

    public static void main(String[] args) {

        final String[] names = new String[3];

        names[1] = "John";
        names[2] = "Harris";
        names[3] = "Lee";

        for (String name : names) {
            System.out.println(name);
        }
    }
}