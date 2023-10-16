package com.digital.kanybek;

public class MakeOutWord {
    public static void main(String[] args) {
        MakeOutWord cod = new MakeOutWord();
        System.out.println(cod.makeOutWord("switch","number"));
    }
    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }
}
