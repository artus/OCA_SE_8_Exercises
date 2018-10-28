package src.chapter5;

public class Exercise36 {

    public static void main(String... args){
        new Human().speakHuman();
    }
}

interface Animal {

    public default String speak() {
        return "Growl";
    }
}

interface Biped extends Animal {

    public String speak();
}

class Human implements Biped {

    public void speakHuman() {
        System.out.println("Animal say '" + this.speak() + "' but us Humans say nicer words.");
    }
}



