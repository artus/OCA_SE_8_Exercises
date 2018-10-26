package src.chapter5;

public class Exercise11 {

    public static void main(String... args) {
        new Human().printName();
    }
}

abstract class Animal {

    public String name = "Animal";

    public final abstract void printName();
}
class Human extends Animal {

    public String name = "Human";

    public final void printName() {
        System.out.println(this.name);
    }
}
