package com.hoan.algo2025.programmers.step0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.
 *
 * 예를 들어 주어진 문자열이 "bac onlettu c etom a to"라면 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가 됩니다.
 *
 * 문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 ["EMPTY"]를 return 합니다.
 *
 *
 * 1 ≤ myStr의 길이 ≤ 1,000,000
 * myStr은 알파벳 소문자로 이루어진 문자열 입니다.
 *
 * myStr	result
 * "baconlettucetomato"	["onlettu", "etom", "to"]
 * "abcd"	["d"]
 * "cabab"	["EMPTY"]
 */
public class 셰_개의_구분자 {
    public static void main(String[] args) {
        String myStr = "baconlettucetomato";
//        String myStr = "abcd";
//        String myStr = "cabab";

        String[] solution = solution(myStr);

        System.out.println(Arrays.toString(solution));
    }

    public static String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : myStr.toCharArray()) {
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                if (sb.length() != 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }

        if (sb.length() != 0) {
            list.add(sb.toString());
        }

        return list.isEmpty()
                ? new String[] { "EMPTY" }
                : list.toArray(new String[0]);
    }

}
