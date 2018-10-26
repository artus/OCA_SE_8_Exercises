package src.chapter5;

public class Exercise8 {

    public static void main(String... args) {
        new Human().printAnimalName();
        new Human().printHumanName();
    }
}

class Animal {

    public String name = "Animal";

    public void printAnimalName() {
        System.out.println("I am a(n) " + name);
    }
}
class Human extends Animal {

    public String name = "Human";

    public void printHumanName() {
        System.out.println("I am a(n) " + this.name);
    }
}
