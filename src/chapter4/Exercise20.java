package src.chapter4;

public class Exercise20 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3};
        editArray(array);
        System.out.println(array[0]);
    }

    public static int[] editArray(int[] array) {
        array[0] = 3;
        return array;
    }
}