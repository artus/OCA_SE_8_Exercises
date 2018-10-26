package src.chapter4;

public class Exercise13 {

    public static int count = 1;

    public static void main(String[] args) {
        Exercise13 e = new Exercise13();
        System.out.println(e.count);
        e = null;
        System.out.println(e.count);
    }
}