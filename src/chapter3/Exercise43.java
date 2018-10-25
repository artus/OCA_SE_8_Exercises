package src.chapter3;

import java.util.*;

public class Exercise43 {

    public static void main(String[] args) {


        String[] strings = {"Hello", "World", "!"};
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(strings));
        stringList.add(1, " ");
        stringList.add(3, " ");

        for (String string : strings) System.out.print(string);
        for (String string : stringList) System.out.print(string);
    }

}