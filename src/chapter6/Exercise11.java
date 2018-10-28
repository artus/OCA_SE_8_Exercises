package src.chapter6;

public class Exercise11 {

    public static void main(String[] args) {

        try {
            throw new ThirdException();
        }
        catch (FirstException e){
            System.out.println("First");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime");
        }
    }
}

class FirstException extends RuntimeException {}
class SecondException extends RuntimeException {}
class ThirdException extends SecondException {}