package com.hoan.algo2025.baekjoon.basic100;

import java.util.Arrays;
import java.util.Scanner;

public class _44_피보나치수 {
    private static int [] f = new int [101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Arrays.fill(f,-1);
        int result = fibonacci(N);
        System.out.println(result);
    }

    private static int fibonacci(int n) {
        if(n==1 || n == 2){
            return 1;
        } else if(f[n] > -1) {
            return f[n];
        } else {
            f[n] = fibonacci(n-1) + fibonacci(n-2);
            return f[n];
        }



    }
}
