package com.dsalgo.arrays_strings.slidingWindow;

public class ZeroFlip {

    public static void main(String[] args) {
        String str = "1101100111";

        int start = 0, end  = 0, count = 0, maxLength = 0 ;

        while (end < str.length()){

            if(str.charAt(end) == '0') count++;

            while(count > 1) {

                if(str.charAt(start) == '0'){
                    count--;
                }

                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
            end++;

        }


        System.out.println(maxLength);

    }
}
