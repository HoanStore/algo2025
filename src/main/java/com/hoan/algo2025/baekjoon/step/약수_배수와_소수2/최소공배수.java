package com.hoan.algo2025.baekjoon.step.약수_배수와_소수2;

import java.util.Scanner;

/**
 * 최대공약수를 구한다.
 * 두 수의 곱을 최대공약수로 나눈다.
 *
 * 1 1
 * 예제 출력 1
 * 1
 * 예제 입력 2
 * 3 5
 * 예제 출력 2
 * 15
 * 예제 입력 3
 * 1 123
 * 예제 출력 3
 * 123
 * 예제 입력 4
 * 121 199
 * 예제 출력 4
 * 24079
 */
public class 최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long gcd = calcGCD(a, b);



        System.out.println((a * b) / gcd);
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
