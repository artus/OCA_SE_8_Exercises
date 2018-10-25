package src.chapter3;

import java.util.ArrayList;

public class Exercise39 {

    public static void main(String[] args) {

        String[] strings = {"Hello", "World", "!"};
        ArrayList<String> emptyArray = new ArrayList<>(strings);
        emptyArray.clear();
        System.out.println(emptyArray.size());
    }

}