package src.chapter5;

public class Exercise41 {

    public static void main(String... args){
        Human.SPEAK();
    }
}

interface Animal {

    public static void SPEAK() {
        System.out.println("GRRR!");
    }
}


class Human implements Animal {
}



