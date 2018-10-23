package src.chapter2;

public class Exercise11 {

    String hello;

    public static void main(String[] args) {

        int x = 6;
        boolean y = (x >= 6) | "test".equals(new Exercise11().hello);
        System.out.println(x);
    }
}