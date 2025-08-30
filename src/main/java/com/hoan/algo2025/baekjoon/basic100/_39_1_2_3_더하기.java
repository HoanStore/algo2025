package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _39_1_2_3_더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int num = sc.nextInt();
            int howMany = calculate(num);
            System.out.println(howMany);
        }

    }

    private static int calculate(int num) {
        int [] dp = new int[num+3];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= num; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[num];
    }
}
