package com.digital.zhyldyz;

public class catDog {
    public boolean catDog(String str) {
        int cat= 0;
        int dog= 0;

        for(int i=0; i<str.length()-2; i++){
            if (str.charAt(i)=='c'&& str.charAt(i+1)=='a'&&str.charAt(i+2)=='t'){
                cat++;
            } if (str.charAt(i)=='d'&& str.charAt(i+1)=='o'&&str.charAt(i+2)=='g'){
                dog++;
            }
        } if (cat==dog){ return true;
        } return false;
    }
}
