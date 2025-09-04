package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

/**
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
 *
 * 별은 가운데를 기준으로 대칭이어야 한다.
 */
public class _54_별찍기_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=0; j<(n-i); j++) {
                System.out.print(" ");
            }

            for(int j=0; j<(2*i)-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
