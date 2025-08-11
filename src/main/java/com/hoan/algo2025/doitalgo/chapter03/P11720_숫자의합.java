package com.hoan.algo2025.doitalgo.chapter03;

import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String sNum = sc.next();

        char[] charArray = sNum.toCharArray();
        int sum = 0;

        for(int i=0; i<charArray.length; i++) {
            sum += charArray[i] - '0';
        }

        System.out.println(sum);
    }
}
