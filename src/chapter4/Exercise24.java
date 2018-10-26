package src.chapter4;

public class Exercise24 {

    public static void main(String[] args) {
        Integer i = new Integer(3);
        System.out.println(i);
        System.out.println(whichType(i));
    }

    public static String whichType(Integer i) {
        return "Integer";
    }

    public static String whichType(int i) {
        return "int";
    }
}