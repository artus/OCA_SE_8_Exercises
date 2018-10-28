package src.chapter6;

public class Exercise1 {

    public static void main(String[] args) {
        TryToRun();
    }

    public static void TryToRun() {

        try {
            Run();
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
        System.out.println("I fell down. I will get up again.");
    }

    public static void Run() {
        throw new RuntimeException();
    }
}