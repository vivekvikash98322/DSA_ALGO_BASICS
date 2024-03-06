package com.dsalgo.complexity;

import java.sql.Timestamp;
import java.util.Date;

public class TimeComplexity {

    public static void main(String[] args) {

        System.out.println(new Timestamp(System.currentTimeMillis()));
        int n = 20;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(j);
            }
        }
        System.out.println();
        System.out.println(new Timestamp(System.currentTimeMillis()));
    }
}
