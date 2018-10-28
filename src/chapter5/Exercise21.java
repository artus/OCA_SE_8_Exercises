package src.chapter5;

public class Exercise21 {

    public static void main(String... args) {
        System.out.println(new Three().getAnotherNumber());
    }
}

interface One {
    public int getNumber();
}

abstract class Two implements One {

    public int getNumber() {
        return 1;
    }

    public abstract int getAnotherNumber();
}

class Three extends Two implements One {

    @Override
    public int getAnotherNumber() {
        return this.getNumber();
    }
}




