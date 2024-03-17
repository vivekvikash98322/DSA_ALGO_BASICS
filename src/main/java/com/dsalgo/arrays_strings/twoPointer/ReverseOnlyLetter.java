package com.dsalgo.arrays_strings.twoPointer;

import java.util.Stack;

public class ReverseOnlyLetter {

    public static void main(String[] args) {

        String s = "a-bC-dEf-ghIj";

        Solution1(s);
        Solution2(s);
    }

    private static void Solution2(String s) {

        int start = 0;
        int end = s.length() - 1;
        char c [] = s.toCharArray();

        while(start < end){

            if(!Character.isLetter(c[start]) && !Character.isLetter(c[end])) {
                start++;
                end--;
            }else if(!Character.isLetter(c[start])) {
                start++;
            }else if(!Character.isLetter(c[end])) {
                end++;
            }else {
                char temp = c[start];
                c[start] = c[end];
                c[end]= temp;

                start++;
                end--;
            }
        }

        System.out.println(new String(c));
    }

    private static void Solution1(String s) {
        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                characters.push(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(characters.pop());
            else
                ans.append(c);
        }

        System.out.println(ans.toString());
    }
}
