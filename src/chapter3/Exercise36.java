package src.chapter3;

import java.util.ArrayList;

public class Exercise36 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList(3);

        list.add("Hello");
        list.add(new StringBuilder("World"));
        list.add('!');

        for (String o : list) System.out.print(o + " ");
    }

}