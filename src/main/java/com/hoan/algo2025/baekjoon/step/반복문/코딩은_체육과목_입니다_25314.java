package com.hoan.algo2025.baekjoon.step.반복문;

import java.util.Scanner;

public class 코딩은_체육과목_입니다_25314 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String pre = "long";
        String post = "int";

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<(N / 4); i++) {
            sb.append(pre).append(" ");
        }

        sb.append(post);

        System.out.println(sb);
    }
}
