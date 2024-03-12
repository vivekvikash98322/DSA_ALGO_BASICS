package com.dsalgo.arrays_strings.slidingWindow;

public class SubArrayMaxAverage {

    public static void main(String[] args) {

//        int array [] = {1,12,-5,-6,50,3};
//        int k = 4;

        int array [] = {-1};
        int k = 1;

        double maxAvg = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += array[i];
        }

        maxAvg = Math.max(maxAvg, ((double) sum/ k));

        for (int i = k; i < array.length; i++) {

            sum += array[i] - array[i - k];
            maxAvg = Math.max(maxAvg, ((double) sum/ k));
        }

        System.out.println(maxAvg);
    }
}
