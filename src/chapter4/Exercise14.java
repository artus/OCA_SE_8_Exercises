package src.chapter4;

public class Exercise14 {

    public int count = 1;

    public static void main(String[] args) {
        Exercise14 e = new Exercise14();
        System.out.println(e.count);
        e = null;
        System.out.println(e.count);
    }
}