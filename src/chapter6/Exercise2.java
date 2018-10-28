package src.chapter6;

public class Exercise2 {

    public static void main(String[] args) {
        TryToRun();
    }

    public static void TryToRun() {

        try {
            Run();
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("I fell down. I will get up again.");
    }

    public static void Run() {
        throw new RuntimeException();
    }
}