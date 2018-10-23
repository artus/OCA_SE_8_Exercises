package src.chapter2;

import src.helpers.Helper;

public class Exercise3 {

    public static void main(String[] args) {

        short $short = 3 + -5;

        String $type1 = Helper.GET_TYPE($short);
        String $type2 = Helper.GET_TYPE(3 + -5);

        System.out.println($type1);
        System.out.println($type2);
    }

}