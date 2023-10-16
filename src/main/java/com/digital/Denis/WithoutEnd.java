package com.digital.Denis;

public class WithoutEnd {

    public static String withoutEnd (String str){
        int len = str.length();
        if (len < 3)
            return "";
        else
            return str.substring(1,str.length()-1);
    }
    public static void main(String[] args) {
        System.out.println(withoutEnd("java"));
    }
}
