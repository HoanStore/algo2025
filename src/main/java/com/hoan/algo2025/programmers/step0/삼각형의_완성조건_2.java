package com.hoan.algo2025.programmers.step0;

import java.util.Arrays;

public class 삼각형의_완성조건_2 {

    public static void main(String[] args) {


    }

    // sides에서 가장 큰 수
    // 11 7
    // 11 -  4
    // 11 - (11 - 7)
    // a - ( a - b)
    // smallNum
    // 18 - 11 - 1
    // big + small  - (big) - 1
    // small - 1
    public static int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[0]*2 - 1;
    }
}
