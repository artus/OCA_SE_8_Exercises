package src.chapter4;

public class Exercise23 {

    public static void main(String[] args) {
        System.out.println(whichType(1));
        System.out.println(whichType(Integer.parseInt("1")));
        System.out.println(whichType(Integer.valueOf("1")));
    }

    public static String whichType(Integer i) {
        return "Integer";
    }

    public static String whichType(int i) {
        return "int";
    }
}