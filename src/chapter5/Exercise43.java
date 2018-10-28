package src.chapter5;

public class Exercise43 {

    public static void main(String... args){
        Animal.SPEAK();
        Human.SPEAK();
    }
}

interface Animal {

    public static void SPEAK() {
        System.out.println("GRRR!");
    }
}


class Human implements Animal {
    public static void SPEAK() {
        System.out.println("Hello there!");
    }
}



