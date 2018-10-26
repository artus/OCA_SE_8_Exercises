package src.chapter4;

public class Exercise11 {

    public static void main(String[] args) {
        int[] integers = {1, 2};
        Exercise11.varargs(integers);
    }

    public static void varargs(int... numbers) {
        System.out.println(numbers[0]);
    }

}