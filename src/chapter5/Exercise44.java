package src.chapter5;

public class Exercise44 {

    public static void main(String... args){
        Human human = new Human();
        Animal animal = human;
        Human human2 = (Human) animal;
    }
}

interface Animal {
}


class Human implements Animal {
}



