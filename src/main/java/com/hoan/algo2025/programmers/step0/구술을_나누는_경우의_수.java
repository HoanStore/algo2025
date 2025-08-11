package com.hoan.algo2025.programmers.step0;

/**
 * 문제 설명
 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
 * 구슬은 모두 다르게 생겼습니다.
 * 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
 * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ balls ≤ 30
 * 1 ≤ share ≤ 30
 * 구슬을 고르는 순서는 고려하지 않습니다.
 * share ≤ balls
 *
 * 입출력 예
 * balls	share	result
 * 3	2	3
 * 5	3	10
 */
public class 구술을_나누는_경우의_수 {
    public static void main(String[] args) {
//        int balls = 3;
//        int share = 2;

        int balls = 5;
        int share = 3;

        int solution = solution(balls, share);

        System.out.println("solution = " + solution);
    }

    public static int otherSolution(int balls, int share) {
        if (share > balls - share) share = balls - share; // 대칭성 활용
        int result = 1;
        for (int i = 1; i <= share; i++) {
            result = result * (balls - i + 1) / i;
        }
        return result;
    }

    public static int solution(int balls, int share) {
        return factorial(balls) / (factorial(share) * factorial(balls - share));
    }

    public static int factorial(int n) {
        int result = 1;

        for(int i=2; i<=n; i++) {
            result *= i;
        }
        return result;
    }
}
