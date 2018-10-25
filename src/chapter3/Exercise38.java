package src.chapter3;

import java.util.ArrayList;

public class Exercise38 {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Beautiful");
        strings.add("Earth");
        strings.add("!");
        strings.remove(1);
        strings.set(1, "World");

        for (String s : strings) System.out.print(s + " ");
    }

}