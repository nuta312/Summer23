package com.digital.Alexandr;

import java.util.List;

public class noNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        //return nums.stream().filter(n-> n>=0).collect(Collectors.toList());

        nums.removeIf(n-> n<0);
        return nums;
    }

}
