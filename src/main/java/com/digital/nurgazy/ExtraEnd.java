package com.digital.nurgazy;

public class ExtraEnd {

    public String extraEnd(String str) {
        String result = str.substring(str.length()-2);
        return result + result + result;
    }

}
