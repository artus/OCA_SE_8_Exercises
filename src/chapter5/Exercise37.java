package src.chapter5;

public class Exercise37 {

    public static void main(String... args){
        new SomePlantAnimalHybrid().move();
    }
}

interface Animal {

    public default void Move() {
        System.out.println("I'm moving!");
    }
}

interface Plant {
    public default void Move() {
        System.out.println("I'm not moving!");
    }
}


class SomePlantAnimalHybrid implements Animal, Plant {
}



