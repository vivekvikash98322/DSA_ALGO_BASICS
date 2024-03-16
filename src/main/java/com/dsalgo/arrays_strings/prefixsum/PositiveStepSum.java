package com.dsalgo.arrays_strings.prefixsum;

public class PositiveStepSum {

    public static void main(String[] args) {

        int [] nums = {-3,2,-3,4,2};
        int minPositiveNum = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums){
            sum += num;
            minPositiveNum = Math.min(minPositiveNum, sum);
        }

        System.out.println(1 - minPositiveNum);
    }
}
