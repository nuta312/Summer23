package com.digital.ulant;

public class ExtraEnd {
    public String extraEnd(String str) {
        String end = str.substring(str.length()-2);
        return end + end + end;
    }

}
