package com.digital.zhyldyz;

public class doubleChar {
    public static String doubleChar(String str) {
        String str2 = "";
        for (int i=0; i<str.length(); i++){
            str2+= str.charAt(i);
            str2+= str.charAt(i);

        } return str2;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("Hello"));
    }
}
