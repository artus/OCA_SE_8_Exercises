package src.chapter5;

public class Exercise19 {

    public static void main(String... args) {
        Living living = new Human();
        System.out.print(living.getAge());
    }
}

interface Living {
}

interface Ageable extends Living {
    public int getAge();
}

abstract class Animal implements Ageable {
    public abstract void printName();
}

class Human extends Animal {

    public String name = "Human";

    public int getAge() {
        return 25;
    }

    public final void printName() {
        System.out.println("I'm a " + name + " and I'm " + this.getAge() + " year(s) old.");
    }
}
