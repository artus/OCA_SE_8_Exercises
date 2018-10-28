package src.chapter6;

public class Exercise4 {

    public static void main(String[] args) {
        TryToRun();
    }

    public static void TryToRun() {

        try {
            Run();
            System.out.println("Trying to run.");
        }
        finally {
            System.out.println("I'll stop running.");
        }

        System.out.println("Try ends.");
    }

    public static void Run() {
        throw new RuntimeException();
    }
}