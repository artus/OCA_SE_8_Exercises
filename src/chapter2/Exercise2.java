package src.chapter2;

import src.helpers.Helper;

public class Exercise2 {

    public static void main(String[] args) {

        short Short = 5;
        byte Byte = 0b11;
        double Double = 1L;
        String Type = Helper.GET_TYPE(Short * Byte * Double++);

        System.out.println(Type);

        System.out.println(Short + Byte++);
        System.out.println(--Short + Byte++);

        System.out.println(Short);
        System.out.println(Byte);
        System.out.println(Double);

    }
}