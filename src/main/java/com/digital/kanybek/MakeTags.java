package com.digital.kanybek;

public class MakeTags {
    public static void main(String[] args) {
        MakeTags codingbat = new MakeTags();
        System.out.println(codingbat.makeTags("i","Yay"));
    }
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

}
