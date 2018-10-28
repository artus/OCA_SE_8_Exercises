package src.chapter5;

public class Exercise45 {

    public static void main(String... args){
        Human human = new Human();
        Animal animal = human;
        Human human2 = animal;
    }
}

interface Animal {
}


class Human implements Animal {
}



