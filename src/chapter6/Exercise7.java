package src.chapter6;

public class Exercise7 {

    public static void main(String[] args) {

        try {
            System.out.println("Trying.");
            throw new FirstException();
        }
        catch {
            System.out.println("Catching.");
        }
        finally {
            System.out.println("Ending.");
        }

    }
}

class FirstException extends RuntimeException {}
class SecondException extends RuntimeException {}
class ThirdException extends SecondException {}