package com.digital.tahir;

public class WithoutEnd {
    public static String withoutEnd(String str) {
        return str = str.substring(1,str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(withoutEnd("John"));
    }
}
