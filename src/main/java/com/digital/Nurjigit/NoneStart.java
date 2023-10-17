package com.digital.Nurjigit;

public class NoneStart {
    public static void main(String[] args) {
        System.out.println(nonStart("map", "7374"));
    }
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

}
