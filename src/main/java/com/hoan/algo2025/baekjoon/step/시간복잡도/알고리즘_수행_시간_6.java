package com.hoan.algo2025.baekjoon.step.시간복잡도;

import java.util.Scanner;

public class 알고리즘_수행_시간_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        System.out.println((N*(N-1)*(N-2)) / 6);
        System.out.println(3);
    }
}
