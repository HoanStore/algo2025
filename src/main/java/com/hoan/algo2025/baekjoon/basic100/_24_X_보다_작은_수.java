package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

/**
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 *
 * 10 5
 * 1 10 4 9 2 3 8 5 7 6
 */
public class _24_X_보다_작은_수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int X = sc.nextInt();

        for(int i=0; i<N; i++) {
            int num = sc.nextInt();
            if(num < X) {
                sb.append(num+" ");
            }
        }


        System.out.println(sb.toString());

    }
}
