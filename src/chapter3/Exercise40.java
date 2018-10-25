package src.chapter3;

import java.util.ArrayList;

public class Exercise40 {

    public static void main(String[] args) {

        String[] strings = {"Hello", "World", "!"};
        ArrayList<String> emptyArray = new ArrayList<>();

        for (String string : strings) emptyArray.add(string);

        emptyArray.clear();
        System.out.println(emptyArray.size());
    }

}