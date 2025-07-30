package com.hoan.algo2025.programmers.step0;

/**
 * 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
 * 정수 i, j, k가 매개변수로 주어질 때,
 * i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
 *
 * 1 ≤ i < j ≤ 100,000
 * 0 ≤ k ≤ 9
 *
 * i	j	k	result
 * 1	13	1	6
 * 10	50	5	5
 * 3	10	2	0
 */
public class k의개수 {
    public static void main(String[] args) {
//        int i = 1;
//        int j = 13;
//        int k = 1;

//        int i = 10;
//        int j = 50;
//        int k = 5;

        int i = 3;
        int j = 10;
        int k = 2;

        int solution = solution(i, j, k);
        int otherSolution = otherSolution(i, j, k);

        System.out.println("solution = " + solution);
        System.out.println("otherSolution = " + otherSolution);
    }


    public static int solution(int i, int j, int k) {
        int answer = 0;

        for(int checkNum=i; checkNum<=j; checkNum++) {
            for(char c : String.valueOf(checkNum).toCharArray()) {
                if(c == Character.forDigit(k, 10)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static int otherSolution(int i, int j, int k) {
        String str = "";

        for(int a = i; a<=j; a++) {
            str += a+"";
        }

        return str.length() - str.replace(k+"", "").length();
    }
}
