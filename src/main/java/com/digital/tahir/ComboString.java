package com.digital.tahir;

public class ComboString {
    public static String comboString(String a, String b) {
        if (a.length() >= b.length()){
            return b+a+b;
        }
        return a+b+a;


    }

    public static void main(String[] args) {
        System.out.println(comboString("John","Jones"));
    }
}
