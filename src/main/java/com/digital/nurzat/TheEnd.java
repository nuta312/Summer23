package com.digital.nurzat;

public class TheEnd {
    public String theEnd(String str, boolean front) {
        return front? ""+str.charAt(0) : ""+str.charAt(str.length()-1);
    }
}
