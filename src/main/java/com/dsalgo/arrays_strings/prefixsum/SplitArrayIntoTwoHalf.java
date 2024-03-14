package com.dsalgo.arrays_strings.prefixsum;

public class SplitArrayIntoTwoHalf {

    public static void main(String[] args) {

        int nums [] = {10,4,-8,7};

        int prefixSum [] = new int [nums.length];

        prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int count = 0;
        for (int i = 0; i < prefixSum.length - 1; i++) {

            if(prefixSum[i] > (prefixSum[prefixSum.length - 1] - prefixSum[i])) {
                count++;
            }

        }

        System.out.println(count);
    }
}
