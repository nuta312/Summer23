package com.digital.zhyldyz;

public class lastChars {
    public static String lastChars(String a, String b) {
        if(a.length()==0) a= "@";
        if(b.length()==0) b= "@";
        return a.substring(0,1)+b.substring(b.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(lastChars("list", ""));
    }
}
