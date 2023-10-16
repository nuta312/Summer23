package com.digital.aida;

public class FirstTwo {
    public String firstTwo(String str) {

        int len = str.length();
        if (len < 2)
            return str;
        else
            return str.substring(0, 2);
    }
}
