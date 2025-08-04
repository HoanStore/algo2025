package com.hoan.algo2025.programmers.step0;

import java.util.Arrays;

/**
 * 정수 배열 arr이 매개변수로 주어집니다.
 * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
 * arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 1 ≤ arr의 길이 ≤ 1,000
 * 1 ≤ arr의 원소 ≤ 1,000
 *
 * arr	result
 * [1, 2, 3, 4, 5, 6]	[1, 2, 3, 4, 5, 6, 0, 0]
 * [58, 172, 746, 89]	[58, 172, 746, 89]
 */
public class 배열의_길이를_2의_거듭제곱으로_만들기 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int[] solution = solution(arr);

        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }

    public static int[] solution(int[] arr) {

        int minNum = whichNumMin(arr.length);
        int [] newAnswer = new int[minNum];

        for(int i=0; i<arr.length; i++) {
            newAnswer[i] = arr[i];
        }


        return newAnswer;
    }

    private static int whichNumMin(int arrLength) {
        int n = 0;
        while ((1 << n) < arrLength) {
            n++;
        }
        return 1 << n;
    }
}
