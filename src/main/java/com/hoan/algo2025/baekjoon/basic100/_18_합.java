package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _18_합 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int answer = 0;


        for(int i=1; i<=N; i++){
            answer += i;
        }
        System.out.println(answer);
    }
}
