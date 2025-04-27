package com.hoan.algo2025.baekjoon.step.일반수학1;

import java.util.Scanner;

/**
 * 60466175 36
 */
public class 진법변화2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String answer = Integer.toString(N, M);
        System.out.println(answer.toUpperCase());
    }
}
