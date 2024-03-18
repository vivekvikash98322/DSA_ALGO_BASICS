package com.dsalgo.arrays_strings.twoPointer;

public class ReversePrefixWord {

    public static void main(String[] args) {

        String word = "xyxzxe";
        char ch = 'z';

        char array [] = word.toCharArray();

        int end = 0;

        while (end < array.length){

            if(array[end] == ch){

                int start = 0;
                int tempIndex = end;
                while (start < tempIndex){
                    char temp = array[start];
                    array[start] = array[tempIndex];
                    array[tempIndex]= temp;
                    start++;
                    tempIndex--;
                }
                break;
            }

            end++;
        }

        System.out.println(new String(array));
    }
}
