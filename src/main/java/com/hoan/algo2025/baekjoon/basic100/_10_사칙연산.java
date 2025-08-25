package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

/**
 * 두 자연수 A와 B가 주어진다.
 * 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 */
public class _10_사칙연산 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);


    }
}
