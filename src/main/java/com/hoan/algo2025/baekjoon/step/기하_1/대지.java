package com.hoan.algo2025.baekjoon.step.기하_1;

// (가장 큰 y - 가장 작은 y ) * (가장 큰 x - 가장 작은 x)

import java.util.Scanner;

/**
 * 3
 * 20 24
 * 40 21
 * 10 12
 *
 *
 * 360
 *
 *
 * 30 * 12
 */
public class 대지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long minX = 99999999;
        long minY = 99999999;

        long maxX = -99999999;
        long maxY = -99999999;


        for(int i=0; i<N; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            if(x > maxX) {
                maxX = x;
            }

            if(x < minX) {
                minX = x;
            }

            if(y > maxY) {
                maxY = y;
            }

            if(y < minY) {
                minY = y;
            }
        }

        System.out.println((maxY - minY) * (maxX - minX));

    }
}
