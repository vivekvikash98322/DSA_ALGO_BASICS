package com.dsalgo.arrays_strings.twoPointer;

public class MoveZeroToEnd {

    public static void main(String[] args) {

        int array [] = {0};

        int start = 0;
        int end = 0;

        while(end < array.length){

            if(array[end] != 0){
                array[start] = array[end];
                start++;
            }
            end++;
        }

        for (int i = start; i <array.length; i++){
            array[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
