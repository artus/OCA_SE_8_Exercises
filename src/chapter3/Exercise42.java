package src.chapter3;

import java.util.ArrayList;

public class Exercise42 {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<Integer>();

        integers.add(1);
        integers.add(2);
        integers.remove(1);

        System.out.println(integers);
    }

}