package com.dsalgo.arrays_strings.slidingWindow;

public class SumLessThen8 {

    public static void main(String[] args) {

        int array [] = {3, 1, 2, 7, 4, 2, 1, 1, 5};

        int start = 0;
        int end = 0;

        int target = 8;
        int maxLength = 0;
        int cur = 0;

        while (end < array.length){

            cur += array[end];

            while(cur > target){
                cur -= array[start];
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }

        System.out.println(maxLength);
    }
}
