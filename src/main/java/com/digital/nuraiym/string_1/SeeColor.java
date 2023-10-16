package com.digital.nuraiym.string_1;

public class SeeColor {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("blueTimes"));
    }

//    Given a string, if the string begins with "red" or "blue"
//    return that color string, otherwise return the empty string.
//    seeColor("redxx") → "red"
//    seeColor("xxred") → ""
//    seeColor("blueTimes") → "blue"

    public static String seeColor(String str) {
        if (str.length() < 3){
            return "";
        }
        if (str.length() >= 3 && str.substring(0, 3).contains("red")) {
            return "red";
        } else if (str.length() >= 4 && str.substring(0, 4).contains("blue")){
            return "blue";
    }
        return "";
    }

}
