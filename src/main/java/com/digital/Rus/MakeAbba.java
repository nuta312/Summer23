package com.digital.Rus;

public class MakeAbba {
    public static String makeAbba(String a, String b){
        return a + b + b + a;
    }

    public static void main(String[] args) {
        System.out.println(makeAbba("Aibike", "Tanos"));
    }
}
