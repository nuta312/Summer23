package com.digital.Alexandr;

import java.util.List;
import java.util.stream.Collectors;

public class no9 {
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(this::delit).collect(Collectors.toList());
        // nums.removeIf(n-> n%10==9);
        // return nums;

    }
    public boolean delit(int n){
        return n%10 !=9;
    }

}
