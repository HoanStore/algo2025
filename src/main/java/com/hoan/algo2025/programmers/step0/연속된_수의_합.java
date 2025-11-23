package com.hoan.algo2025.programmers.step0;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 문제 설명
 * 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ num ≤ 100
// * 0 ≤ total ≤ 1000
 * num개의 연속된 수를 더하여 total이 될 수 없는 테스트 케이스는 없습니다.
 * 입출력 예
 * num	total	result
 * 3	12	[3, 4, 5]
 * 5	15	[1, 2, 3, 4, 5]
 * 4	14	[2, 3, 4, 5]
 * 5	5	[-1, 0, 1, 2, 3]
 *
 * 아이디어)
 * 슬라이드 윈도우 기법이 떠오름.
 * num이 슬라이드 윈도우의 크기임.
 *
 *
 *
 *
 */
public class 연속된_수의_합 {

    public static void main(String[] args) {
//        int num = 3;
//        int total = 12;

//        int num = 5;
//        int total = 15;

//        int num = 4;
//        int total = 14;
//
        int num = 5;
        int total = 5;



        int[] solution = solution(num, total);

        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int num, int total) {

        int[] array = IntStream.rangeClosed(-1100, 1100).toArray();

        int initSum = 0;
        for(int i=0; i<num; i++) {
            initSum += array[i];
        }

        int checkI = 0;
        for(int i=0; i<array.length; i++) {

            if(i + num >= array.length) {
                break;
            }
            initSum = initSum - array[i];
            initSum = initSum + array[i+num];

            if(initSum == total) {
                checkI = i;
            }
        }
        int [] answer = new int[num];

        for(int i=0; i<num; i++) {
            answer[i] = array[i+checkI+1];
        }

        return answer;
    }
}
