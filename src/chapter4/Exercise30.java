package src.chapter4;

public class Exercise30 {

    static { add(2); }
    static void add(int num) { System.out.print(num + " "); }
    Exercise30() { add(5); }
    static { add(4); }
    { add(6); }
    static { new Exercise30(); }
    { add(8); }
    public static void main(String... args) {}
}