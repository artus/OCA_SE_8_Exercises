package src.chapter3;

public class Exercise15 {

    public static void main(String[] args) {

        String one = "two";

        System.out.println(one != "two" ? "Yes" : (one = "one"));
        System.out.println(one);
    }
}