package com.digital.sergey;

public class firstTwo {
    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.length() > 2) {

        } return str.substring(0, 2);

    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
    }
}
