package com.dsalgo.arrays_strings.twoPointer;

public class TargetSumWithPointers {

    public static void main(String[] args) {

        int array [] = {2,7,11,15};
        int target = 9;
        int ans  [] = twoSum(array, target);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans [] = new int [2];
        while (start < end){

            int sum = nums[start] + nums[end];

            if(sum > target){
                end--;
            }else if(sum < target){
                start++;
            } else{
                ans[0] = start;
                ans[1] = end;
                break;
            }
        }

        return ans;
    }
}
