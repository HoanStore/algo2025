package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

/**
 * 기수 정렬 문제임.
 *
 */
public class _32_숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numberCnt = new int[10];

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();


        long result = A * B * C;

        while (result > 0) {
            int num = (int) (result % 10);
            result = result / 10;

            numberCnt[num]++;
        }

        for (int i : numberCnt) {
            System.out.println(i);
        }
    }
}
