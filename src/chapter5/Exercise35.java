package src.chapter5;

public class Exercise35 {

    public static void main(String... args){
        new Human().speakHuman();
    }
}

interface Animal {

    public default String speak() {
        return "Growl";
    }
}

class Human implements Animal {

    public void speakHuman() {
        System.out.println("Animal say '" + this.speak() + "' but us Humans say nicer words.");
    }
}



