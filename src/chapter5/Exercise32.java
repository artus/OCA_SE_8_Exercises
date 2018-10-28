package src.chapter5;

public class Exercise32 {

    public static void main(String... args){
        CanSpeak someObject = new Human();
        someObject.speak();
    }
}

abstract class CanSpeak {

    public void speak() {
        System.out.println("Growl");
    }
}

class Human extends CanSpeak {

    public void speak() {
        System.out.println("I can speak a language.");
    }
}




