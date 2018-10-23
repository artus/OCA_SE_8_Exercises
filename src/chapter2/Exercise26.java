package src.chapter2;

public class Exercise26 {

    public static void main(String[] args) {

        int i = 0;
        long b = 6;

        for (long a = b = 3; a == b && b < 6; a++, b++) {
            i++;
        }

        System.out.println(i);
    }
}