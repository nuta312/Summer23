package org.example.rus;

public class ComboString {
    public static String comboString(String a, String b) {
        if (a.length()>b.length() ){
            return b + a + b;
        }else {
            return a + b+ a;
        }
    }

    public static void main(String[] args) {
        System.out.println(comboString("jumpToUp", "jumpToLow"));
    }

}
