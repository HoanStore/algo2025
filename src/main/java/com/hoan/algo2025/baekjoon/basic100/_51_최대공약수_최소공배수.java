package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _51_최대공약수_최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = getGCD(a, b);

        System.out.println(gcd);
        System.out.println((a * b) / gcd);
    }

    private static int getGCD(int a, int b) {
        if(a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        while(true) {
            if(a % b == 0) {
                return b;
            }

            int r = (a % b);
            a = b;
            b = r;
        }
    }
}
