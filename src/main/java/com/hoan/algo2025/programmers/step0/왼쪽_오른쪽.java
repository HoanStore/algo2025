package com.hoan.algo2025.programmers.step0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
 * str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로
 * 왼쪽에 있는 문자열들을 순서대로 담은 리스트를,
 * 먼저 나오는 문자열이 "r"이라면
 * 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * "l"이나 "r"이 없다면 빈 리스트를 return합니다.
 *
 * 1 ≤ str_list의 길이 ≤ 20
 * str_list는 "u", "d", "l", "r" 네 개의 문자열로 이루어져 있습니다.
 *
 * str_list	result
 * ["u", "u", "l", "r"]	["u", "u"]
 * ["l"]	[]
 */
public class 왼쪽_오른쪽 {
    public static void main(String[] args) {
        // String [] str_list = {"u", "u", "l", "r"};
        String [] str_list = {"r","l"};
        String[] solution = solution(str_list);

        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }
// 지시 그대로 코드 짜겠음
    public static String[] solution(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                // l이면 왼쪽 부분 반환
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                // r이면 오른쪽 부분 반환
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        // l이나 r이 없으면 빈 배열
        return new String[0];
    }
}
