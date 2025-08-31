package com.hoan.algo2025.baekjoon.basic100;

import java.util.Scanner;

public class _43_소수찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;

        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            if(isPrime(num)) {
                answer++;
            }
        }
        System.out.println(answer);
    }


    private static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
              return false;
            }
        }
        return true;
    }
}
