package com.hoan.algo2025.programmers.step0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 정수 배열 array와 정수 n이 매개변수로 주어질 때,
 * array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 1 ≤ array의 길이 ≤ 100
 * 1 ≤ array의 원소 ≤ 100
 * 1 ≤ n ≤ 100
 * 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
 *
 * array	n	result
 * [3, 10, 28]	20	28
 * [10, 11, 12]	13	12
 */
public class 가까운_수 {
    public static void main(String[] args) {
//        int [] array = {3, 10, 28};
//        int n = 20;

        int [] array = {10, 11, 12};
        int n = 13;

        int solution = solution(array, n);

        System.out.println("solution = " + solution);
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);

        int distanceTwoNumber = 999999999;

        for (int num : array) {
            if(distanceTwoNumber > Math.abs(num - n)) {
                distanceTwoNumber = Math.abs(num - n);
                answer = num;
            }
        }
        return answer;
    }
}
