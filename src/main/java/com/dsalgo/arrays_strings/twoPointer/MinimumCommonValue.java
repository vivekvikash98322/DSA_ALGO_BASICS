package com.dsalgo.arrays_strings.twoPointer;

public class MinimumCommonValue {
    public static void main(String[] args) {

        int num1 [] = {1,2,3,6};
        int num2 [] = {2,3,4,5};

        System.out.println(getMin(num1, num2)); ;

    }

    private static int getMin(int[] num1, int[] num2) {
        int startNum1 = 0;
        int startNum2 = 0;

        while (startNum1 < num1.length && startNum2 < num2.length){

            if(num1[startNum1] == num2[startNum2]){
                return num1[startNum1];
            } else if(num1[startNum1] < num2[startNum2]){
                startNum1++;
            }else {
                startNum2++;
            }
        }

        return -1;
    }
}
