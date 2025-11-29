package com.hoan.algo2025.gpt.recursion;

/**
 * (재귀 연습문제)
 * 1부터 N까지의 합 구하기
 */
public class SumFrom1ToN {
    public static void main(String[] args) {
        int N = 20;

        int answer = sum(N);

        System.out.println(answer);
    }

    private static int sum(int n) {
        if(n == 1 ) return 1;
        else return n + sum(n-1);
    }
}
