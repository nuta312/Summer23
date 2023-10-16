package com.digital.zhyldyz;

public class repeatEnd {
    public String repeatEnd(String str, int n) {

        String repeatAnd= "";
        for (int i=0; i<n; i++){
            repeatAnd+= str.substring(str.length()-n);

        } return repeatAnd;
    }

}
