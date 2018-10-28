package src.chapter5;

public class Exercise40 {

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
    public void move();
}


class SomePlantAnimalHybrid implements Animal, Plant {
}



