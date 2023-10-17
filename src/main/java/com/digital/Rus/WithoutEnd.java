package com.digital.Rus;<<<<<<< HEAD:src/main/java/org/example/rus/WithoutEnd.java
package org.example.rus;

public class WithoutEnd {
    public static String withoutEnd(String str){
        return str.substring(1,str.length()-1);
=======
package com.digital.tansuluu;

public class WithoutEnd {
    public static String withoutEnd(String str) {
        int len = str.length();

        return str.substring(1,len - 1);
    }

    public static void main(String[] args) {
        System.out.println(withoutEnd("Hello"));
>>>>>>> c57f7aef982b7c3b754958d2bd1209df83fdabef:src/main/java/com/digital/tansuluu/WithoutEnd.java
    }
}
