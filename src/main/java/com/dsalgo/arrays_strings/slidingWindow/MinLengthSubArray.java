package com.dsalgo.arrays_strings.slidingWindow;

public class MinLengthSubArray {

    public static void main(String[] args) {

        int [] nums = {2,3,1,2,4,3};
        int target = 7;

        int start = 0;
        int end = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (end < nums.length){

            sum += nums[end];

            while(sum >= target){
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }

            end++;
        }

        System.out.println(minLen);
    }
}
