package com.digital.Nurjigit;

public class FirtsTwo {
    public static void main(String[] args) {
        System.out.println(firstTwo("djhk"));
    }
    public static String firstTwo(String str) {
        if(str.length() < 2)
            return str;

        return str.substring(0, 2);




    }
}
