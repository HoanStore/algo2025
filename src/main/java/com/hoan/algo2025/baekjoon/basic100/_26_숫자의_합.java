package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _26_숫자의_합 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int answer = 0;

        sc.nextInt();
        String strNum = sc.next();

        for(char ch: strNum.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        System.out.println(answer);
    }
}
