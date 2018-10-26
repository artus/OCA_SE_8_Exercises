package src.chapter5;

public class Exercise5 {

    public static void main(String... args) {
        One one = new One();
    }
}

class One {
    public int getAge();
}
class Two extends One {
    private int getAge();
}
