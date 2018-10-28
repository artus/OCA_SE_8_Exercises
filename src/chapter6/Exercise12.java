package src.chapter6;

public class Exercise12 {

    public static void main(String... args) {
        throwException();
    }

    public static void throwException() throws UncheckedException {
        throw new UncheckedException();
    }
}

class UncheckedException extends RuntimeException {}
