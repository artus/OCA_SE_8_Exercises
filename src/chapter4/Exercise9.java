package src.chapter4;

public class Exercise9 {

    public static void main(String[] args) {
        Exercise9.printArray(1, 2, 3);
    }

    public static void printArray(int firstOne, int... numbers) {
        System.out.print(firstOne + " ");
        for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");
    }

}