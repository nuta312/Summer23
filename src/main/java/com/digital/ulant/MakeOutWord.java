package com.digital.ulant;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String firstPartOfOut = out.substring(0, 2);
        String secondPartOfOut = out.substring(2);
        return firstPartOfOut + word + secondPartOfOut;
    }
}
