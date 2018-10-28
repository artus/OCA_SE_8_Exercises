package src.chapter5;

public class Exercise25 {

    public static void main(String... args) {
        System.out.println(new Three().getNumber());
    }
}

interface One {
    public int getNumber();
}

interface Two {
    public double getNumber();
}

abstract class OntAndTwo implements One, Two {}

class Three implements One {

    public int getNumber() {
        return 0;
    }
}




