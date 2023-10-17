package com.digital.aykerim;

public class FirstHalf {
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
    }

    public static String firstHalf(String str) {
        int half = str.length()/2;
        return str.substring(0, half);
    }
}
