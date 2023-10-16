package com.digital.zhyldyz;

public class endOther {
    public boolean endOther(String a, String b) {
        String c= a.toLowerCase();
        String d= b.toLowerCase();
        if (c.endsWith(d) || d.endsWith(c)) {
            return true;
        }
        return false;
    }
}
