package com.dsalgo.arrays_strings.twoPointer;

public class ReverseWord {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";

//        Solution1(s);
        Solution2(s);
    }

    private static void Solution1(String s) {
        int start = 0;
        int end = s.length() - 1;

        char c [] = s.toCharArray();

        while (start < end){

            char temp = c[end];
            c[end] = c[start];
            c[start] = temp;

            start++;
            end--;
        }

        String str = new String(c);
        String [] temp = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = temp.length - 1; i >=0 ; i--) {
            stringBuilder.append(temp[i] + " ");
        }

        System.out.println(stringBuilder.toString().trim());
    }

    private static void Solution2(String s) {

        int start = 0;
        int end = 0;

        char c [] = s.toCharArray();

        while (end < c.length){

            if (c[end] == ' ' || end == c.length - 1){

                int tempIndex = c[end] == ' ' ? end - 1 : end;

                while (start < tempIndex){
                    char temp = c[tempIndex];
                    c[tempIndex] = c[start];
                    c[start] = temp;
                    tempIndex--;
                    start++;
                }

                start = end + 1;
                end++;

            }else {
                end++;
            }

        }

        System.out.println(new String(c));
    }
}
