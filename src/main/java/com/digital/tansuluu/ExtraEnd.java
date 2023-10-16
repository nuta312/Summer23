package com.digital.tansuluu;

    public  static String extraEnd(String str) {
        String result = str.substring(str.length()-2);
        return result + result + result;
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
    }
}
