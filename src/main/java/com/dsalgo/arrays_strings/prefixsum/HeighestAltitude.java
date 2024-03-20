package com.dsalgo.arrays_strings.prefixsum;

public class HeighestAltitude {

    public static void main(String[] args) {

        int [] gain = {-4,-3,-2,-1,4,3,2};

        int maxAltitude = 0;
        int altitide = 0;

        for (int i = 0; i < gain.length; i++) {
            altitide += gain[i];
            maxAltitude = Math.max(maxAltitude, altitide);
        }


        System.out.println(maxAltitude);

    }
}
