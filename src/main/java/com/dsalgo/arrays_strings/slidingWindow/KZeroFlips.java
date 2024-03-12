package com.dsalgo.arrays_strings.slidingWindow;

public class KZeroFlips {

    public static void main(String[] args) {

        int nums [] = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int start = 0, end = 0, max = 0, count = 0;

        while (end < nums.length) {

            if(nums[end] == 0) count++;

            while(count > k) {

                if(nums[start] == 0) count--;
                start++;
            }

            max = Math.max(max, end - start + 1);
            end++;
        }

        System.out.println(max);
    }
}
