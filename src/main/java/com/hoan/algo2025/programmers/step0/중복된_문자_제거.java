package com.hoan.algo2025.programmers.step0;

import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * HashSet을 사용해, 해당 문자가 있는지 확인 후
 * 없으면 정답 문자열에 추가. 그리고 HashSet에도 추가
 *
 * 있으면 skip.
 */
public class 중복된_문자_제거 {
    public static void main(String[] args) {
//        String my_string = "people";
        String my_string = "We are the world";
        String solution = solution(my_string);
        String otherSolution = otherSolutionUsingStream(my_string);

        System.out.println("solution = " + solution);
        System.out.println("otherSolution = " + otherSolution);
    }

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> duplicateCheck = new HashSet<>();


        for (Character c: my_string.toCharArray()) {
            if (!duplicateCheck.contains(c)) {
                sb.append(c);
                duplicateCheck.add(c);
            }

        }
        return sb.toString();
    }

    public static String otherSolutionUsingStream(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }
}
