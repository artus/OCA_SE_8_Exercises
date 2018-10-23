package src.chapter2;

public class Exercise27 {

    public static void main(String[] args) {

        int i = 0;

        for (long a, long b = 0; a == b && b < 1; a++, b++) {
            i++;
        }

        System.out.println(i);
    }
}