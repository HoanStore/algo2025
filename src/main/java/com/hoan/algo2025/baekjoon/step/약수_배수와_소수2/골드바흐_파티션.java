package com.hoan.algo2025.baekjoon.step.약수_배수와_소수2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 5
 * 6
 * 8
 * 10
 * 12
 * 100
 *
 * 1
 * 1
 * 2
 * 1
 * 6
 *
 * 1. primeNumSet 안에 100만 이하의 모든 소수를 저장한다.
 * 2. 특정 숫자 Num에 대해서 골드 바흐 파티션을 구할 떄,
 *    2부터 시작해 Num까지 골드 바흐 파티션을 구한다.
 */
public class 골드바흐_파티션 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        TreeSet<Integer> primeNumSet = new TreeSet<Integer>();

        for(int i=2; i<=100_0000; i++) {
            if(isPrime(i)) {
                primeNumSet.add(i);
            }
        }

        for(int i=0; i<N; i++) {
            int num = sc.nextInt();
            int count = 0;
            for(int j: primeNumSet.headSet((num / 2) + 1)) {
                if(primeNumSet.contains(num-j)) {
                    count++;
                }
            }

            bw.write(count+"\n");
        }


        bw.flush();
        bw.close();


    }

    private static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0) return false;

        for(int i=3; i*i <= n; i+=2) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
