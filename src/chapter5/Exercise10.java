package src.chapter5;

public class Exercise10 {

    public static void main(String... args) {
        new Human().printName();
    }
}

class Animal {

    public String name = "Animal";

    public void printName() {
        System.out.println("My name is " + this.name);
    }
}
class Human extends Animal {

    public String name = "Human";
}
