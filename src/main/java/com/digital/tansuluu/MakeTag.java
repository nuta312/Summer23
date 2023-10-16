package com.digital.tansuluu;

public class MakeTag {
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<"+ "/"+tag +">";
    }

    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));
    }
}
