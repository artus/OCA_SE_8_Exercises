package src.chapter4;

import static java.util.Arrays.asList;

public class Exercise22 {

    public static void main(String[] args) {
        final int[] array = { 1, 2, 3};
        int result = editArray(array);
        System.out.println(result);
    }

    public static int editArray(int[] array) {
        return array[0] = 3;
    }
}