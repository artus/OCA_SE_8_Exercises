package src.chapter4;

public class Exercise8 {

    public static void main(String[] args) {
        Exercise8.printArray(1, 2, 3);
    }

    public static void printArray(int... numbers, int lastOne) {
        for (int number : numbers) System.out.print(numbers + " ");
        System.out.println(lastOne);
    }

}