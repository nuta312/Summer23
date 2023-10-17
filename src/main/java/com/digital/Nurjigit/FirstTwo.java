package com.digital.Nurjigit;

public class FirstTwo {
    public static void main(String[] args) {
        System.out.println(firstTwo("Nissan"));
    }
    public static String firstTwo(String str) {
        if(str.length()<2) return str;
        return str.substring(0,2);
    }

}
