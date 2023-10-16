package com.digital.tahir;

public class FirstTwo {
    public static String firstTwo(String str) {
        if (str.length() >=3)
            return str.substring (0,2);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("John"));

    }
}
