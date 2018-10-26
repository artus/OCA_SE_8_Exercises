package src.chapter4;

import java.util.*;

public class Exercise34 {

    public static void main(String... args) {

        List<String> iList = Arrays.asList(new String[]{"Long", "Short", "Double", "Integer", "Byte"});
        ArrayList<String> list = new ArrayList<>(iList);
        list.removeIf(item -> item.length() > 4);
        for (String item : list) System.out.println(item);
    }
}
