package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _59_별찍기_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for(int i=1; i<=N; i++) {

            for(int j=(N-i); j>0; j--) {
                System.out.print(" ");
            }

            for(int j=1; j<(i+1); j++) {
                System.out.print("*");
                if(j > 1) {
                    for(int k=1; k<j; k++) {
                        System.out.print("*");
                    }

                }

            }



            System.out.println();
        }







    }
}
