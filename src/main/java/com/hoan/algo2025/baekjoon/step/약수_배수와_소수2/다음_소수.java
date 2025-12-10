package com.hoan.algo2025.baekjoon.step.약수_배수와_소수2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 다음_소수 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = sc.nextInt();

        for(long i = 1; i <= N; i++){
            long num = sc.nextLong();

            bw.write(getNextMinPrimeNum(num)+"\n");

        }

        bw.flush();
        bw.close();


    }


    private static long getNextMinPrimeNum(long num) {
        if (num <= 2) return 2;
        if (num % 2 == 0) num++;

        for (long i = num; ; i += 2) {
            if (isPrime(i)) return i;
        }
    }

    private static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;

        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
