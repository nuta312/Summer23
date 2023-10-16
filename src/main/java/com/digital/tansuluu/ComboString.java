package com.digital.tansuluu;

public class ComboString {
    public  static String comboString(String a, String b) {
        if (a.length()>b.length()){
            return b+a+b;
        }else if (a.length()<b.length()){
            return a+b+a;
        }return  a+b+a;

    }

    public static void main(String[] args) {
        System.out.println(comboString("hi", "Hello"));
    }
}
