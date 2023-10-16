package com.digital.Denis;

public class ExtraEnd {

    public static String extraEnd(String str){
        String a = str.substring(str.length()-2);
        return a+a+a;
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
    }
}
