package src.chapter4;

public class Exercise29 {

    public static void main(String[] args) {
        new Exercise29();
    }

    public Exercise29() {
        this(1);
    }

    public Exercise29(Integer i) {
        this("Hello");
    }

    public Exercise29(Object o) {
        System.out.println("Object");
    }

    public Exercise29(long i) {
        this(new Object());
    }

    public Exercise29(String s) {
        System.out.println("String");
    }
}