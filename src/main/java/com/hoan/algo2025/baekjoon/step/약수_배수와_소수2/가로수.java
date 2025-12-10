package com.hoan.algo2025.baekjoon.step.약수_배수와_소수2;

import java.util.Scanner;

/**
 * 아이디어)
 * 떨어진 거리에 대한 최대공약수를 구한다.
 * 떨어진 거리 / GCD - 1을 더한다.
 *
 */
public class 가로수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long [] distances = new long[N-1];

        long beforeNum = -1;
        for(int i = 0; i < N; i++){
            if(beforeNum == -1){
                beforeNum = sc.nextInt();
            } else {
                int currentNum = sc.nextInt();
                distances[i-1] = currentNum - beforeNum;
                beforeNum = currentNum;
            }
        }

        beforeNum = -1;
        long minGCD = Long.MAX_VALUE;
        for (long distance : distances) {
            if(beforeNum == -1){
                beforeNum = distance;
            } else {
                minGCD = Math.min(getGCD(beforeNum, distance), minGCD);
            }
        }

        long answer = 0;

        for(long distance : distances){
            answer += (distance / minGCD) - 1;
        }

        System.out.println(answer);
    }

    private static long getGCD(long a, long b) {
        if(a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }

        while(true) {
            if(a % b == 0) {
                return b;
            }

            long tmp = a;
            a = b;
            b = tmp % b;
        }
    }
}
