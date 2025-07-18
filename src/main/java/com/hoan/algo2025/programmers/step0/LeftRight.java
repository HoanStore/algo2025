package com.hoan.algo2025.programmers.step0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
 * str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를,
 * 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은
 * 리스트를 return하도록 solution 함수를 완성해주세요. "l"이나 "r"이 없다면
 * 빈 리스트를 return합니다.
 *
 *
 * 제한사항
 * 1 ≤ str_list의 길이 ≤ 20
 * str_list는 "u", "d", "l", "r" 네 개의 문자열로 이루어져 있습니다.
 *
 *
 * 입출력 예
 * str_list	result
 * ["u", "u", "l", "r"]	["u", "u"]
 * ["l"]	[]
 */
public class LeftRight {
    public static void main(String[] args) {
        LeftRight leftRight = new LeftRight();

        String [] str_list = {"u", "u", "l", "r"};

        String[] solution = leftRight.solution(str_list);

        for (String s : solution) {
            System.out.println("s = " + s);
        }
        

    }

    public String[] solution(String[] str_list) {
        List<String> lefts = new ArrayList<>();
        List<String> rights = new ArrayList<>();

        int leftIndex = IntStream.range(0, str_list.length)
                .filter(i -> "l".equals(str_list[i]))
                .findFirst()
                .orElse(-1);

        int rightIndex = IntStream.range(0, str_list.length)
                .filter(i -> "l".equals(str_list[i]))
                .findFirst()
                .orElse(-1);


        lefts.addAll(Arrays.asList(str_list).subList(0, leftIndex));
        rights.addAll(Arrays.asList(str_list).subList(rightIndex + 1, str_list.length));

        if (leftIndex < rightIndex) {
            return lefts.toArray(new String[0]);
        }

        return rights.toArray(new String[0]);
    }
}
