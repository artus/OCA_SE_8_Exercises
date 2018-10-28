package src.chapter5;

public class Exercise39 {

    public static void main(String... args){
        new SomePlantAnimalHybrid().move();
    }
}

interface Animal {

    public default void move() {
        System.out.println("I'm moving!");
    }
}

interface Plant {
    public default void move() {
        System.out.println("I'm not moving!");
    }
}


class SomePlantAnimalHybrid implements Animal, Plant {
    public void move() {
        System.out.println("Whatever.");
    }
}



