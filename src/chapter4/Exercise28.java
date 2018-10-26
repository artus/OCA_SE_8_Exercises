package src.chapter4;

public class Exercise28 {

    public static void main(String[] args) {
        new Exercise28();
    }

    public Exercise28() {
        this(1);
    }

    public Exercise28(Integer i) {
        this("Hello");
    }

    public Exercise28(Object o) {
        System.out.println("Object");
    }

    public Exercise28(long i) {
        this(null);
    }

    public Exercise28(String s) {
        System.out.println("String");
    }

}