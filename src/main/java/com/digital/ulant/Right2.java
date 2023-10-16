package com.digital.ulant;

public class Right2 {
    public String right2(String str) {
        String word = str.substring(str.length()-2);
        return word + (str.substring(0,str.length()-2));
    }
}
