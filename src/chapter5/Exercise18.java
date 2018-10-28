package src.chapter5;

public class Exercise18 {

    public static void main(String... args) {
        new Human().printName();
    }
}

interface Living {
    public int getAge();
}

interface Ageable extends Living {
}

abstract class Animal implements Ageable {
    public abstract void printName();
}

class Human extends Animal {

    public String name = "Human";

    public final void printName() {
        System.out.println("I'm a " + name + " and I'm " + this.getAge() + " year(s) old.");
    }
}
