package com.dsalgo.arrays_strings.slidingWindow;

public class SubArrayWithLargestSumAndFixedLength {

    public static void main(String[] args) {
         int nums [] = {3 , -1 , 4, 12, -8, 5, 6};

         int k = 4;

         int sum  =0;
         int maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxSum = Math.max(maxSum, sum);

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] -  nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
