package com.digital.ulant;

public class MakeTags {
    public String makeTags(String tag, String word) {
        return "<"+ tag + ">" + word + "<" + "/" + tag + ">";
    }
}
