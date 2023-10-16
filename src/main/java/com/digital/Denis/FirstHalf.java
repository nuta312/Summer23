package com.digital.Denis;

public class FirstHalf {

    public static String firstHalf (String str){
        int abc = str.length()/2;
        return str.substring(0,abc);
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
    }
}
