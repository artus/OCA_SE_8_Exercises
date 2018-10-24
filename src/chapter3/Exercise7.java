package src.chapter3;

public class Exercise7 {

    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}