package com.digital.Nurjigit;

public class MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>","Sd. Kfz. 182 Panzerkampfwagen VI Tiger II Ausfuhrung B."));

    }
    public static String makeOutWord(String out, String word){
        return  out.substring(0,2)+word+out.substring(2,4);

    }
}
