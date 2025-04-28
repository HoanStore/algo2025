package com.hoan.algo2025.baekjoon.step.재귀;

import java.util.Scanner;

public class 팩토리얼2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long answer = factorial(N);
        System.out.println(answer);
    }

    private static long factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
