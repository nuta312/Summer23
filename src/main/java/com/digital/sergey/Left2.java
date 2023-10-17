package com.digital.sergey;

public class Left2 {
    public static String left2(String str) {
        if (str.length()<2){
            return str;}
        if (str.length()>2);
        return str.substring(2,str.length())+str.substring(0,2);
    }

    public static void main(String[] args) {
        System.out.println(left2("Hello"));
    }
}
