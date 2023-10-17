package com.digital.aykerim;

public class EndsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
    }

    public static boolean endsLy(String str) {
        int len = str.length();
        String ly = "ly";

        if (len < 2)
            return false;
        else if (ly.equals(str.substring(len-2,len)))
            return true;
        else
            return false;
    }
}
