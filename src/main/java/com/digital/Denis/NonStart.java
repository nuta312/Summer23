package com.digital.Denis;

public class NonStart {

    public static String nonStart(String a,String b){
        return a.substring(1,a.length()) + b.substring(1,b.length());
    }

    public static void main(String[] args) {
        System.out.println(nonStart("java", "code"));
    }
}

