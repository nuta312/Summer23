package com.digital.Nurjigit;

public class WithoutEnd {
    public static void main(String[] args) {
        System.out.println(withoutEnd("Porsche"));
    }
    public static String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }
}
