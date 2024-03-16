package com.dsalgo.arrays_strings.prefixsum;

import java.util.Arrays;

public class KRadiusSubArray {

    public static void main(String[] args) {

        int nums [] = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        int avg = 2*k + 1;

        int ans [] = new int [nums.length];

        Arrays.fill(ans, - 1);

        int sum = 0;
        for (int i = 0; i <= (2 * k); i++) {
            sum+= nums[i];
        }

        ans[avg - 1 - k] = sum/avg;

        for (int i = avg; i < nums.length; i++) {

            sum += (nums[i] - nums[i - avg]);
            ans[i - k] = sum/avg;
        }

        for (int num : ans){
            System.out.print(num + " ");
        }
    }
}
