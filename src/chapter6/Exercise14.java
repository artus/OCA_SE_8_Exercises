package src.chapter6;

public class Exercise14 {

    private String color;

    public Exercise14() {
        this("White");
    }

    public Exercise14(String color) {
        color = color;
    }

    public static void main (String... args) {
        Exercise14 e = new Exercise14();
        System.out.println("Color:"  + e.color);
    }

}
