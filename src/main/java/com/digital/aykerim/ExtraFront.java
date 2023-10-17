package com.digital.aykerim;

public class ExtraFront {
    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
    }
    public static String extraFront(String str) {
        if (str.length() >1) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
        if (str.length() == 1) {
            return str.substring(0, 1) + str.substring(0, 1) + str.substring(0, 1);
        }

        return str;
    }
}
