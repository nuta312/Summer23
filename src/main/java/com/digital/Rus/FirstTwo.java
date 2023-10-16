package org.example.rus;

public class FirstTwo {
    public static String firstTwo(String str) {
        return str.length()<2?str:str.substring(0,2);
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Its my life"));
    }
}
