package src.chapter5;

public class Exercise26 {

    public static void main(String... args) {
        new Human().print();
    }
}

interface HasLegs {

}

interface Animal {

}

interface Biped extends HasLegs {
    public static final amountOfLegs = 2;
}

interface Quadruped extends HasLegs {
    public static final amountOfLegs = 4;
}

class Human implements Animal, Biped {

    public void print() {
        System.out.println("I walk on " + amountOfLegs + " legs.");
    }
}




