package com.digital.kanybek;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(out.length()-2);
    }
    public static void main(String[] args) {
        MakeOutWord codingbat = new MakeOutWord();
        System.out.println(codingbat.makeOutWord("****","Yay"));
    }
}
