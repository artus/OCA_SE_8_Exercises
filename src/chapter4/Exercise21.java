package src.chapter4;

public class Exercise21 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3};
        int result = editArray(array);
        System.out.println(result);
    }

    public static int editArray(int[] array) {
        return array[0] = 3;
    }
}