package src.chapter4;

public class Exercise17 {

    public final static int count;

    static {
        count = 3;
    }

    public Exercise17() {
        // Do nothing
    }

    public static void main(String[] args) {
        System.out.println(new Exercise17().count);
    }
}