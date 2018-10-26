package src.chapter5;

public class Exercise15 {

    public static void main(String... args) {
        new Animal().printName();
    }
}

abstract class Animal {

    public final String name = "Animal";

    public abstract void printName();
}
class Human extends Animal {

    public String name = "Human";

    public final void printName() {
        System.out.println(this.name);
    }
}
