package com.hoan.algo2025.programmers.step0;

import java.util.Arrays;

/**
 * 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
 * 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
 * 정수가 담긴 배열 numlist와 정수 n이 주어질 때
 * numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 1 ≤ n ≤ 10,000
 * 1 ≤ numlist의 원소 ≤ 10,000
 * 1 ≤ numlist의 길이 ≤ 100
 * numlist는 중복된 원소를 갖지 않습니다.
 *
 * numlist	n	result
 * [1, 2, 3, 4, 5, 6]	4	[4, 5, 3, 6, 2, 1]
 * [10000,20,36,47,40,6,10,7000]	30	[36, 40, 20, 47, 10, 6, 7000, 10000]
 *
 */
public class 특이한_정렬 {

    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;

        int[] solution = solution(numlist, n);

        System.out.println(Arrays.toString(solution));
    }


    public static int[] solution(int[] numlist, int target) {

        Integer [] boxed = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (a, b) -> {
            int diffA = Math.abs(a - target);
            int diffB = Math.abs(b - target);

            if (diffA == diffB) {
                return b - a;
            } else {
                return diffA - diffB;
            }

        });

        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }

}
