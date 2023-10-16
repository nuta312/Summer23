package com.digital.tahir;

public class ExtraEnd {
    public static String extraEnd(String str) {
        int word = str.length();
        String temp1 = str.substring(word - 2, word);
        return (temp1 + temp1 + temp1);
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("John"));

    }
}
