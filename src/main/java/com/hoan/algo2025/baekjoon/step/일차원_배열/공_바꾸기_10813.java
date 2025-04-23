package com.hoan.algo2025.baekjoon.step.일차원_배열;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 5 4
 * 1 2
 * 3 4
 * 1 4
 * 2 2
 */
public class 공_바꾸기_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] ints = new int[N];

        IntStream.range(0, ints.length).forEach(i -> ints[i] = i+1);

        for(int i=0; i<M; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int tempNum1 = ints[num1 - 1];
            int tempNum2 = ints[num2 - 1];

            ints[num1 - 1] = tempNum2;
            ints[num2 - 1] = tempNum1;
        }
        IntStream.range(0, ints.length).forEach(i -> System.out.print(ints[i]+" "));
    }
}
