package com.hoan.algo2025.programmers.step0;

/**
 * i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
 * 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
 * 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
 *
 * i! ≤ n
 *
 * 0 < n ≤ 3,628,800
 *
 * n	result
 * 3628800	10
 * 7	3
 */
public class 팩토리얼 {
    public static void main(String[] args) {
//        int n = 3628800;
        int n = 7;

        int solution = solution(n);
        System.out.println("solution = " + solution);

    }


    public static int solution(int targetNum) {
        int answer = 0;
        int startNum = 0;

        while (factorial(++startNum) <= targetNum) {
            answer = startNum;
        }
        return answer;
    }

    public static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
}
