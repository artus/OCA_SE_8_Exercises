package src.chapter3;

public class Exercise8 {

    public static void main(String[] args) {

        String name = "John";
        int three = name.toLowerCase().indexOf('J');
        name = name.substring(three);
        System.out.println(name);
    }
}