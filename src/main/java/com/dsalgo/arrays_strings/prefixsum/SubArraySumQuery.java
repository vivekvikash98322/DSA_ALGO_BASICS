package com.dsalgo.arrays_strings.prefixsum;

public class SubArraySumQuery {

    public static void main(String[] args) {

        int queries [][] = {{0, 3}, {2, 5}, {2, 4}};

        int nums [] = {1, 6, 3, 2, 7, 2};

        int limit = 13;
        int prefixSum [] = new int [nums.length + 1];
        boolean ans [] = new boolean [queries.length];

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }


        int index = 0;
        for (int qu [] : queries){
            int start = qu[0];
            int end = qu[1];

            int sum = prefixSum[end + 1] - prefixSum[start];

            if(sum > limit){
                ans[index] = false;
            }else{
                ans[index] = true;
            }

            index++;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

}
