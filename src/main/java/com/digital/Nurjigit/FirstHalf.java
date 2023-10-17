package com.digital.Nurjigit;

public class FirstHalf {
    public static void main(String[] args) {
        System.out.println(firstHalf("Toyota"));
    }public static String firstHalf(String str) {
        int half = str.length()/2;
        return str.substring(0, half);
    }

}
