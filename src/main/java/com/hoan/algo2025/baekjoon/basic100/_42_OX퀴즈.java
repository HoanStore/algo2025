package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _42_OX퀴즈 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();


        for(int i=0; i<N; i++) {
            int sum = 0;
            int cnt = 1;
            String next = sc.next();

            for(int j=0; j<next.length(); j++) {
                if(next.charAt(j) == 'O') {
                    sum += cnt;
                    cnt++;
                } else {
                    cnt = 1;
                }
            }

            sb.append(sum+"\n");
        }

        System.out.println(sb);



    }
}
