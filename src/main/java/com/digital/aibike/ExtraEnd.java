package com.digital.aibike;

public class ExtraEnd {
    public String extraEnd(String str) {
        String sub = str.substring(str.length() - 2);
        return sub+sub+sub;
    }
}
