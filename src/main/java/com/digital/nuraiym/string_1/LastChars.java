package com.digital.nuraiym.string_1;

public class LastChars {
    public static void main(String[] args) {
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }

//    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
//    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
//    lastChars("last", "chars") → "ls"
//    lastChars("yo", "java") → "ya"
//    lastChars("hi", "") → "h@"

    public static String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() == 0){
            return "@@";
        } else if (a.length() == 0){
            return "@" + b.substring(b.length() - 1);
        } else if (b.length() ==0){
            return a.substring(0,1) + "@";
        } else {
            return a.substring(0,1) + b.substring(b.length() - 1);
        }
    }
}
