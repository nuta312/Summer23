package com.digital.Sasha;

public class frontTimes {
    public String frontTimes(String str, int n) {
        String result ="";
        if (str.length()<3){
            for(int i=0;i<n;i++){
                result= result+str;
            }

        }else{
            for(int i=0; i<n; i++){
                result +=str.substring(0,3);
            }

        }
        return result;

    }
}
