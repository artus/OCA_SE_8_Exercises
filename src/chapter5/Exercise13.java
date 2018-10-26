package src.chapter5;

public class Exercise13 {

    public static void main(String... args) {
        new Human().printName();
    }
}

abstract final class Animal {

    public String name = "Animal";

    public abstract void printName();
}
class Human extends Animal {

    public String name = "Human";

    public final void printName() {
        System.out.println(this.name);
    }
}
