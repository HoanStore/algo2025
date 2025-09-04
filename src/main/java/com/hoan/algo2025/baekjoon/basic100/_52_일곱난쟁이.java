package com.hoan.algo2025.baekjoon.basic100;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 일곱난쟁이를 구해야 함.
 * 일곱난쟁이의 키 합은 100
 *
 * 단순 for문으로 구할 수 있음!
 *
 */
public class _52_일곱난쟁이 {

    static int[] arr;
    static int[] result = new int[7];
    static boolean found = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        arr = new int[9];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        findCombination(0, 0, 0);
    }

    private static void findCombination(int start, int depth, int sum) {
        // 이미 정답을 찾았으면 중복 탐색 방지
        if (found) return;

        // 7개를 선택했을 때
        if (depth == 7) {
            if (sum == 100) {
                Arrays.sort(result);
                // 정답 출력
                for (int num : result) {

                    System.out.println(num);
                }
                System.out.println();
                found = true;
            }
            return;
        }

        // start부터 배열 끝까지 탐색
        for (int i = start; i < arr.length; i++) {
            result[depth] = arr[i];
            findCombination(i + 1, depth + 1, sum + arr[i]);
        }
    }
}
