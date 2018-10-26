package src.chapter4;

public class Exercise31 {

    public static void main(String... args) {
        new InitializationHell();
    }

}

class InitializationHell {
    static { add(2); }
    static void add(int num) { System.out.print(num + " "); }
    InitializationHell() { add(5); }
    static { add(4); }
    { add(6); }
    static { new InitializationHell(); }
    { add(8); }
}