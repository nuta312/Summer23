package com.digital.nurzat;

public class EndsLy {
    public static boolean endsLy(String str) {

        if(str.endsWith("ly"))
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
    }
}
