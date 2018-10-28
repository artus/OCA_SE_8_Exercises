package src.chapter6;

public class Exercise13 {

    public static void main(String... args) {
        throwException();
    }

    public static void throwException() throws UncheckedException {
        System.out.println("No exception thrown.");
    }
}

class UncheckedException extends Exception{}
