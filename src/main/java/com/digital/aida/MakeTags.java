package com.digital.aida;

public class MakeTags {
    public String makeTags(String tag, String word) {
        String html = "<" + tag + ">" + word + "</" + tag + ">";
        return html;

    }
}
