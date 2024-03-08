package com.dsalgo.arrays_strings.twoPointer;

public class ReverseCharecterArray {

    public static void main(String[] args) {
        char s [] = {'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {

        int start = 0;
        int end  = s.length - 1;

        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end]= temp;

            start++;
            end--;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
