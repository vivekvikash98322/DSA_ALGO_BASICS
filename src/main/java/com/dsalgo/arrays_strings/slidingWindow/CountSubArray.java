package com.dsalgo.arrays_strings.slidingWindow;

public class CountSubArray {

    public static void main(String[] args) {

        int array [] = {57,44,92,28,66,60,37,33,52,38,29,76,8,75,22};
        int k = 18;

        int start = 0, end = 0, product = 1, count = 0;

        while ( end < array.length) {

            product *= array[end];

            while (product >= k){

                product /= array[start];
                start++;
            }

            count += (end - start + 1);

            end++;
        }

        System.out.println(count);

    }
}
