package src.chapter5;

public class Exercise4 {

    public static void main(String... args) {
        One one = new One();
    }
}

class One extends Two {}
class Two extends One {}
