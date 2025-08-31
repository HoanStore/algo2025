package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _46_문자열반복 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            int strLength = sc.nextInt();
            String str = sc.next();

            for(int j=0; j<str.length(); j++){
                sb.append(String.valueOf(str.charAt(j)).repeat(strLength));
            }

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
