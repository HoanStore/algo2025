package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

/**
 * 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 */
public class _12_별찍기_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1; i<=N; i++) {

            for(int j=0; j<(N-i); j++) {
                System.out.print(" ");
            }

            for(int j=0; j<i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
