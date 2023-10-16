package com.digital.nuraiym.string_1;

public class EndsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));

    }

//    Given a string, return true if it ends in "ly".
//    endsLy("oddly") → true
//    endsLy("y") → false
//    endsLy("oddy") → false

    public static boolean endsLy(String str) {
        if (str.length() <=1){
            return false;
        }
        if (str.substring(str.length()-2).endsWith("ly")){
            return true;
        }
        return false;
    }

}
