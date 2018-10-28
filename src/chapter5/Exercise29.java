package src.chapter5;

public class Exercise29 {

    public static void main(String... args){
        new Human().print();
    }
}

interface HasLegs {

}

interface Animal {

}

interface Biped extends HasLegs {
    int amountOfLegs = 0;
}

interface Quadruped extends HasLegs {
    public static final int amountOfLegs = 4;
}

class Human implements Animal, Biped {

    int amountOfLegs = 2;

    public void print() {
        System.out.println("I walk on " + amountOfLegs + " legs.");
    }
}




