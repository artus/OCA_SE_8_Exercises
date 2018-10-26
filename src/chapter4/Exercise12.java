package src.chapter4;

public class Exercise12 {

    public static void main(String[] args) {
        Exercise12.varargs(null);
    }

    public static void varargs(int... numbers) {
        System.out.println(numbers[0]);
    }

}