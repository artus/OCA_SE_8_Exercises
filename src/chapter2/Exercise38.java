package src.chapter2;

public class Exercise38 {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        OUTER_LOOP: while( i < 10 ) {
            i++;

            INNER_LOOP: while (j < 10) {
                if (i % 2 == 0) continue OUTER_LOOP;
                j++
            }
        }

        System.out.println(i);
        System.out.println(j);
    }
}
