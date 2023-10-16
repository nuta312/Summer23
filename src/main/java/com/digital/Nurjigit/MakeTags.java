package com.digital.Nurjigit;

public class MakeTags {
    public static String makeAbba(String a, String b) {
        return "<"+a + ">" + b +"</" + a + ">";
    }

    public static void main(String[] args) {
        System.out.println(makeAbba("Hello","Aibike"));
    }
}
