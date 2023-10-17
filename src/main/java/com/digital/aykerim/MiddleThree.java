package com.digital.aykerim;

public class MiddleThree {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
    }

    public static String middleThree(String str) {
        int len = str.length() / 2;

        return str.substring(len-1,len+2);
    }

}
