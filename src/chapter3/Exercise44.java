package src.chapter3;

import java.util.*;

public class Exercise44 {

    public static void main(String[] args) {


        String[] strings = {"Hello", "World", "!"};
        List<String> stringList = Arrays.asList(strings);

        stringList.set(1, " ");
        stringList.set(2, "World");
        stringList.set(3, " ");
        stringList.add("!");

        for (String string : strings) System.out.print(string);
    }

}