package com.digital.elmira;
public class HelloName {
   public static String helloName(String name) {
       return "Hello" + ' ' + name + "!";
   }
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
    }
}
