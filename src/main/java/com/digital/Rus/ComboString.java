package com.digital.Rus;<<<<<<< HEAD:src/main/java/org/example/rus/ComboString.java
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

=======
package com.digital.tansuluu;

public class ComboString {
    public  static String comboString(String a, String b) {
        if (a.length()>b.length()){
            return b+a+b;
        }else if (a.length()<b.length()){
            return a+b+a;
        }return  a+b+a;

    }
    public static void main(String[] args) {
        System.out.println(comboString("hi", "Hello"));
    }
>>>>>>> c57f7aef982b7c3b754958d2bd1209df83fdabef:src/main/java/com/digital/tansuluu/ComboString.java
}
