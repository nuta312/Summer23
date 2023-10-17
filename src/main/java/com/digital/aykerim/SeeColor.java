package com.digital.aykerim;

public class SeeColor {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));
    }
    public static String seeColor(String str) {
        if (str.startsWith("red"))
            return "red";
        if (str.startsWith("blue"))
            return "blue";
        else
            return "";
    }
}
