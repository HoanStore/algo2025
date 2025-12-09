package com.hoan.algo2025.baekjoon.step.약수_배수와_소수2;

import java.util.Scanner;

/**
 * 2 7
 * 3 5
 *
 * 31 35
 */
public class 분수_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long c = sc.nextLong();
        long d = sc.nextLong();



        long bunmo = b * d;
        long bunja = a * d + c * b;

        long gcd = calcGCD(bunja, bunmo);

        System.out.println(bunja / gcd + " " + bunmo / gcd);
    }

    private static long calcGCD(long a, long b) {
        if(a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }

        while(true) {
            if(a % b == 0) {
                return b;
            }

            long tmp = a % b;
            a = b;
            b = tmp;
        }
    }
}
