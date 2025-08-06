package com.hoan.algo2025.programmers.step0;

/**
 * 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
 * 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
 *
 * 1 ≤ array의 길이 ≤ 100
 * 0 ≤ array의 원소 ≤ 100,000
 *
 * array	result
 * [7, 77, 17]	4
 * [10, 29]	0
 */
public class _7의_개수 {
    public static void main(String[] args) {
//        int [] array = {7, 77, 17};
        int [] array = {10, 29};

        int solution = solution(array);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[] array) {
        int answer = 0;

        for (int i : array) {
           answer += sevenCounter(i);
        }

        return answer;
    }

    private static int sevenCounter(int i) {
        int cnt = 0;
        String s = String.valueOf(i);

        for(char ch: s.toCharArray()) {
            if(ch == '7') {
                cnt++;
            }
        }
        return cnt;
    }
}
