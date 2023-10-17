package com.digital.Rus;

public class ExtraEnd {
    public static String extraEnd(String str) {
        String end = str.substring(str.length()-2);
        return end + end+ end;
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
    }
}
