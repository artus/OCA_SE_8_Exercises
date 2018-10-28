package src.chapter5;

public class Exercise20 {

    public static void main(String... args) {
        System.out.println(new Human().printName());
    }
}

interface Living {
    public int getAge();
}

interface Ageable extends Living {
    private int getAge();
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
