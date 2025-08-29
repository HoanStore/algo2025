package com.hoan.algo2025.baekjoon.basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _29_더하기싸이클 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int cur = N;
        int count = 0;

        do {
            int ten = cur / 10;
            int one = cur % 10;

            int sum = ten + one;

            cur = one * 10 + (sum % 10);
            count++;

        } while (N != cur);

        System.out.println(count);
    }

}
