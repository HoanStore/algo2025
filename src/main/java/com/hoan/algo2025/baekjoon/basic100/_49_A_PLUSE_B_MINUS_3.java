package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _49_A_PLUSE_B_MINUS_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sb.append(a + b).append("\n");
        }

        System.out.println(sb);
    }
}
