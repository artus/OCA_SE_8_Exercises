package src.chapter4;

public class Exercise15 {

    public static int count = 1;

    public static void main(String[] args) {
        Exercise15 e1 = new Exercise15();
        Exercise15 e2 = new Exercise15();
        System.out.println(e1.count);
        e2.count = 3;
        System.out.println(e1.count);
    }
}