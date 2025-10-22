package com.hoan.algo2025.baekjoon.step.약수_배수와_소수1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class 약수_구하기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
                if (i != N / i) {      // 제곱수 중복 방지
                    list.add(N / i);
                }
            }
        }
        Collections.sort(list);

        if (K <= list.size()) System.out.println(list.get(K - 1));
        else System.out.println(0);

    }
}
