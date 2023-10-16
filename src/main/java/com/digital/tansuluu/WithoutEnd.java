package com.digital.tansuluu;

public class WithoutEnd {
    public static String withoutEnd(String str) {
        int len = str.length();

        return str.substring(1,len - 1);
    }

    public static void main(String[] args) {
        System.out.println(withoutEnd("Hello"));
    }
}
