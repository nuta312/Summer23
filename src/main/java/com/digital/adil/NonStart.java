package com.digital.adil;

public class NonStart {
    public static String nonStart(String a, String b) {
        String firstWord = a.substring(1);
        String secondWord = b.substring(1);
        String result = firstWord.concat(secondWord);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(nonStart("Mike","Tyson"));
    }

}
