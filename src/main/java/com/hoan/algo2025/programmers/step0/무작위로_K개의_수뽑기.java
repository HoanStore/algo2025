package com.hoan.algo2025.programmers.step0;

// arr	k	result
//[0, 1, 1, 2, 2, 3]	3	[0, 1, 2]
//[0, 1, 1, 1, 1]	4	[0, 1, -1, -1]

import java.util.Arrays;

public class 무작위로_K개의_수뽑기 {
    public static void main(String[] args) {
        int [] arr  = {0, 1, 1, 2, 2, 3};
        int k = 3;

//        int [] arr  = {0, 1, 1, 1, 1};
//        int k = 4;

        int[] solution = solution(arr, k);

        System.out.println(Arrays.toString(solution));

    }

    // arr에 대해서 중복되지 않은 숫자만 남김.
    public static int[] solution(int[] arr, int k) {

        int[] array = Arrays.stream(arr).distinct().toArray();
        int [] answer = new int[k];

        for(int i=0; i<k; i++) {
            if(i > array.length -1) {
                answer[i] = -1;
            } else {
                answer[i] = array[i];
            }

        }

        return answer;
    }
}
