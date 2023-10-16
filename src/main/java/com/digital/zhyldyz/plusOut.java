package com.digital.zhyldyz;

public class plusOut {
    public boolean xyBalance(String str) {
        if (str.length()<1) return true;
        if (!str.contains("x")) return true;
        for(int i=0; i<str.length(); i++){
            if (str.lastIndexOf('x') < str.lastIndexOf('y')) return true;
        } return false;
    }
}
