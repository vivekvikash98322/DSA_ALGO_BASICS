package com.dsalgo.arrays_strings.slidingWindow;

public class MaximumNumberOfVowels {

    public static void main(String[] args) {

        String s  = "aeiou";
        int k = 2;

        solution1(k, s);
        solution2(k, s);

    }

    private static void solution1(int k, String s) {
        String vowels = "aeiou";
        int count = 0;
        int maxNumber = 0;
        for (int i = 0; i < k; i++) {

            if(vowels.indexOf(s.charAt(i)) >= 0){
                count++;
            }
        }

        maxNumber = Math.max(maxNumber, count);


        int start = 0;
        for (int i = k; i < s.length(); i++) {

            if(vowels.indexOf(s.charAt(i)) >= 0){
                count++;
            }

            if(vowels.indexOf(s.charAt(start)) >= 0){
                count--;
            }

            start++;

            maxNumber =   Math.max(maxNumber, count);
        }

        System.out.println(maxNumber);
    }

    private static void solution2(int k, String s) {
        String vowels = "aeiou";

        int start = 0;
        int end = 0;
        int count = 0;
        int maxCount = 0;


        while (end < s.length()){

            if(vowels.indexOf(s.charAt(end)) >= 0){
                count++;
            }

            while ((end - start + 1) > k){
                if(vowels.indexOf(s.charAt(start)) >= 0){
                    count--;
                }

                start++;
            }

            maxCount = Math.max(maxCount, count);
            end++;
        }

        System.out.println(maxCount);
    }
}
