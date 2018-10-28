package src.chapter5;

public class Exercise31 {

    public static void main(String... args){
        CanSpeak someObject = new Human();
        someObject.speak();
    }
}

interface CanSpeak {

    public default void speak() {
        System.out.println("Growl");
    }
}

class Human implements CanSpeak {

    public void speak() {
        System.out.println("I can speak a language.");
    }
}




