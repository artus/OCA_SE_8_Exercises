package src.chapter5;

public class Exercise24 {

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

class Three implements One, Two {

    public int getNumber() {
        return 0;
    }

    public double getNumber() {
        return 0.0;
    }
}




