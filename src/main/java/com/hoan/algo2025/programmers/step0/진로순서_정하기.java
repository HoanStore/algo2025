package com.hoan.algo2025.programmers.step0;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
 * 정수 배열 emergency가 매개변수로 주어질 때
 * 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 중복된 원소는 없습니다.
 * 1 ≤ emergency의 길이 ≤ 10
 * 1 ≤ emergency의 원소 ≤ 100
 *
 *
 * emergency	result
 * [3, 76, 24]	[3, 1, 2]
 * [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
 * [30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
 */
public class 진로순서_정하기 {
    public static void main(String[] args) {
//        int [] emergency = {3, 76, 24};
//        int [] emergency = {1, 2, 3, 4, 5, 6, 7};
        int [] emergency = {30, 10, 23, 6, 100};
        int[] solution = solution(emergency);

        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sorted = emergency.clone();

        Arrays.sort(sorted);
        HashMap<Integer, Integer> rankedMap = new HashMap<>();

        for(int i=emergency.length-1, rank=1; i>=0; i--, rank++) {
            rankedMap.put(sorted[i], rank);
        }

        for(int i=0; i<emergency.length; i++) {
            answer[i] = rankedMap.get(emergency[i]);
        }

        return answer;
    }
}
