package src.chapter6;

public class Exercise10 {

    public static void main(String[] args) {

        try {
            throw new SecondException();
        }
        catch(Exception e) {
            System.out.println("Exception");
        }
        catch (FirstException e){
            System.out.println("First");
        }
        catch (ThirdException e){
            System.out.println("Third");
        }
        catch (SecondException e){
            System.out.println("Second");
        }
    }
}

class FirstException extends RuntimeException {}
class SecondException extends RuntimeException {}
class ThirdException extends SecondException {}