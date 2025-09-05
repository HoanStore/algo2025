package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _62_지능형_기차 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inSubway = 0;
        int max = -1;

        for(int i=0; i<4; i++) {
            int out = input.nextInt();
            int in = input.nextInt();

            inSubway += (in - out);

            if(inSubway > max) {
                max = inSubway;
            }
        }

        System.out.println(max);

    }
}
