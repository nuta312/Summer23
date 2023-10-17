package com.digital.aibike;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String sub1 = out.substring(0,2);
        String sub2 = out.substring(2);
        return sub1+word+sub2;
    }
}
