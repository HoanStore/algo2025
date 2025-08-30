package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _37_평균점수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i=0; i<5; i++) {
            int point = sc.nextInt();
            if(point < 40) {
                sum += 40;
            } else {
                sum += point;
            }
        }

        System.out.println(sum / 5);
    }
}
