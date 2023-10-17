package com.digital.Rus;

public class MakeTags {
    public static String makeTags(String tag, String word) {
        return '<' + tag + '>' + word + "</" + tag + '>';
    }

    public static void main(String[] args) {
        System.out.println(makeTags("SDET", "Digital Nomads"));
    }

}
