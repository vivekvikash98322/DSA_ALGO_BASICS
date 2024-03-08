package com.dsalgo.arrays_strings.twoPointer;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int arr1[] = {1, 4, 7, 20};
        int arr2[] = {3, 5, 6};

        int finalArray[] = new int[arr1.length + arr2.length];

        int start = 0;
        int secStart = 0;
        int i = 0;
        while (start < arr1.length && secStart < arr2.length) {

            if (arr1[start] < arr2[secStart]) {
                finalArray[i] = arr1[start];
                start++;
            } else {
                finalArray[i] = arr2[secStart];
                secStart++;
            }
            i++;
        }


        while (start < arr1.length) {
            finalArray[i] = arr1[start];
            start++;
            i++;
        }

        while (secStart < arr2.length) {
            finalArray[i] = arr2[secStart];
            secStart++;
            i++;
        }

        for (int j = 0; j < finalArray.length; j++) {
            System.out.print(finalArray[j] + " ");
        }
    }
}
