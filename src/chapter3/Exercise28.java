package src.chapter3;

import java.util.Arrays;

public class Exercise28 {

    public static void main(String[] args) {

        int [] numbers = { 3, 6, 5, 1};
        Arrays.sort(numbers);
        int indexOf5 = Arrays.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + numbers[indexOf5]);
    }
}