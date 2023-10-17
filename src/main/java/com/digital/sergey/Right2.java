package com.digital.sergey;

public class Right2 {
    public static String right2(String str) {
        if (str.length()<3){
            return str;}
        if (str.length()>3);
        String a = str.substring(str.length() - 2);
        return a+str.substring(0,str.length()-2);
    }

    public static void main(String[] args) {
        System.out.println(right2("Hello"));
    }
}
