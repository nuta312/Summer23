package com.digital.aida;

public class ExtraName {
    public String extraEnd(String str) {
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }
}
