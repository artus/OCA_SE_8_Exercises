package src.chapter6;

public class Exercise8 {

    public static void main(String[] args) {

        try {
            throw new FirstException();
        }
        catch (FirstException e){
            System.out.println("First");
        }
        catch (SecondException e){
            System.out.println("Second");
        }
        catch (ThirdException e){
            System.out.println("Third");
        }
    }
}

class FirstException extends RuntimeException {}
class SecondException extends RuntimeException {}
class ThirdException extends SecondException {}