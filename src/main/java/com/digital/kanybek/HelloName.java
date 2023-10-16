package com.digital.kanybek;

public class HelloName {
    public static void main(String[] args) {
        HelloName codingbat = new HelloName();
        System.out.println(codingbat.helloName("Bob"));
    }
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}
