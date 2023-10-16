package com.digital.kanybek;

public class MakeAbba {
    public static void main(String[] args) {
        MakeAbba codingbat = new MakeAbba();
        System.out.println(codingbat.makeAbba("Hi","Bye"));
    }
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
