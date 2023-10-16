package com.digital.tansuluu;

public class FirstTwo {
    public  static String firstTwo(String str) {
        if(str.length() < 2){
            return str;
        }


        return str.substring(0, 2);
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
    }
}
