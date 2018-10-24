package src.chapter3;

public class Exercise18 {

    public static void main(String[] args) {

        int [] array1 = { 0, 1, 2};
        int array2 [] = new int { 0, 1 ,2};

        boolean areEqual = true;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) areEqual = false;
        }

        System.out.println(areEqual);

    }
}