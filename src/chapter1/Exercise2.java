package src.chapter1;

public class Exercise2 {

    private String name;
    private boolean willCompile;
    private boolean will_it_really = false;

    public static void main(String[] args) {

        Exercise2 e = new Exercise2();

        System.out.println("Name = " + e.name);
        System.out.println("Will compile: " + e.willCompile);
        System.out.println("Really? " + e.will_it_really);
    }
}