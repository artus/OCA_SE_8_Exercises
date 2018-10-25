package src.chapter3;

public class Exercise25 {

    public static void main(String[] args) {

        int [] numbers = { 3, 4, 1, 2, 0};
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}