package src.chapter2;

import src.helpers.Helper;

public class Exercise1 {

    public static void main(String[] args) {

        short Short = 5;
        byte Byte = 0b11;
        String Type = Helper.GET_TYPE(Short * Byte);

        System.out.println(Type);

        System.out.println(--Short % 2);
        System.out.println(Short + Byte++);
    }
}