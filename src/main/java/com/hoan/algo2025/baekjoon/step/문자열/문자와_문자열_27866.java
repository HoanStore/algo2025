package com.hoan.algo2025.baekjoon.step.문자열;

import java.util.Scanner;

public class 문자와_문자열_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();

        System.out.println(str.charAt(N-1));
    }
}
