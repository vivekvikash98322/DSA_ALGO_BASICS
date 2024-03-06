package com.dsalgo.arrays_strings;

public class PalindromCheck {

    public static void main(String[] args) {

        String s = "racecar";

        int start = 0;
        int end = s.length() - 1;
        boolean isPalindrom = true;

        while (start < end){

            if(s.charAt(start) != s.charAt(end)){
                isPalindrom = false;
            }

            start++;
            end--;
        }

        System.out.println(isPalindrom);
    }
}
