package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _50_벌집 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int startNum = 2;
        int endNum = 7;

        if(N == 1) {
            System.out.println(0);
            return;
        }


        for(int i=1;i<=N;i++){
            if(startNum <= N && endNum >= N) {
                System.out.println(i+1);
                break;
            }
            startNum = endNum + 1;
            endNum = (i+1) * 6 + endNum;
        }

    }
}
