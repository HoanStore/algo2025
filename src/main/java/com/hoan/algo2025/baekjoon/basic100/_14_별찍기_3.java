package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _14_별찍기_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=N; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
