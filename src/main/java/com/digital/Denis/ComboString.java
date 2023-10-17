package com.digital.Denis;

public class ComboString {
    public static String comboString(String a, String b) {
        int lenA = a.length();
        int lenB =b.length();
        if (lenA > lenB)
            return b + a + b;
        else
            return a + b + a;
    }

    public static void main(String[] args) {
        System.out.println(comboString("hi", "Hello"));
    }


}
