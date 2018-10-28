package src.chapter6;

public class Exercise6 {

    public static void main(String[] args) {
        TryToRun();
    }

    public static void TryToRun() {

        String s = "";

        try {
            s += "a";
            Run();
            s += "b";
        }
        catch (RuntimeException e) {
            s += "c";
        }
        catch(Exception e) {
            s += "d";

        }
        finally {
            if (s == null) s = "e";
        }

        System.out.println(s);
    }

    public static void Run() {
        throw new RuntimeException();
    }
}