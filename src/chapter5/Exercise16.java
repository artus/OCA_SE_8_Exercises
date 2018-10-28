package src.chapter5;

public class Exercise16 {

    public static void main(String... args) {
        new Animal().printName();
    }
}

interface Animal {
}

class Human implements Animal {

    public String name = "Human";

    public final void printName() {
        System.out.println(this.name);
    }
}
