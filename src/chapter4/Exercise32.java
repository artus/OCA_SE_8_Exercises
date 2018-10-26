package src.chapter4;

import java.util.function.*;

public class Exercise32 {

    static public void executeLambda(int[] numbers, Predicate<Integer> p) {
        for (int i : numbers)
        if (p.test(i)) System.out.println(i);
    }

    public static void main(String... args) {
        executeLambda(new int[]{1, 2, 3}, i -> i % 2 == 0);
    }
}
