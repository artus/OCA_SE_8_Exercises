package src.chapter4;

public class Exercise10 {

    public static void main(String[] args) {
        Exercise10.varargs(1, 2, 3);
    }

    public static void varargs(int... numbers) {
        System.out.println(numbers[0]);
    }

}