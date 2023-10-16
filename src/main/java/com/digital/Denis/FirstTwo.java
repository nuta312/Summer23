package com.digital.Denis;

public class FirstTwo {
    public static String firstTwo(String str){
        int length = str.length();
        if (length < 2)
            return str;
        else {
            return str.substring(0,2);
        }
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
    }
}
