package src.chapter6;

public class Exercise3 {

    public static void main(String[] args) {
        TryToRun();
    }

    public static void TryToRun() {

        try {
            System.out.println("Trying to run.");
            Run();
        }
        catch (Exception e) {
            System.out.println("I fell down.");
        }
        finally {
            System.out.println("I will get up again.");
        }
    }

    public static void Run() {
        throw new RuntimeException();
    }
}