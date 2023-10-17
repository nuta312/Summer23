package com.digital.Nurjigit;

public class ComboString {
    public static void main(String[] args) {
        System.out.println(comboString("Tiger", "2"));
    }
    public static String comboString(String a, String b) {
        if(a.length()==0 || b.length()==0) return a+b;
        if(a.length()< b.length()){
            return a+b+a;
        }else if(a.length()> b.length()){
            return b+a+b;
        }
        return a+b;
    }

}
