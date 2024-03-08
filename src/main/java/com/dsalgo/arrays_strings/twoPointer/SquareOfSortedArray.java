package com.dsalgo.arrays_strings.twoPointer;

public class SquareOfSortedArray {

    public static void main(String[] args) {

        int array [] = {-4,-1,0,3,10};
        int finalAns [] = sortedSquares(array);

        for (int i = 0; i < finalAns.length; i++) {
            System.out.println(finalAns[i]);
        }
    }

    public static int[] sortedSquares(int[] nums) {

        int ans [] = new int [nums.length];

        int start = 0;
        int end = nums.length - 1;

        int index = nums.length - 1;

        while(start < end){

            int startValue = nums[start]*nums[start];
            int endValue = nums[end]*nums[end];

            if(startValue > endValue){
                ans[index] = startValue;
                start++;
                index--;
            }else {
                ans[index] = endValue;
                end--;
                index--;
            }
        }

        return ans;
    }
}
