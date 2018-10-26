package src.chapter5;

public class Exercise6 {

    public static void main(String... args) {
        One one = new One();
    }
}

class One {
    public Integer getAge();
}
class Two extends One {
    public int getAge();
}
