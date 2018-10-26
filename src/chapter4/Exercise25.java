package src.chapter4;

public class Exercise25 {

    public static void main(String[] args) {
        System.out.println(whichType("Hey there"));
        System.out.println(whichType((short) 1));
    }

    public static String whichType(String i) {
        return "String";
    }

    public static String whichType(Object o) {
        return "Object";
    }
}