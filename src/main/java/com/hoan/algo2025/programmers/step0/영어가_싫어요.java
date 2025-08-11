package com.hoan.algo2025.programmers.step0;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제 설명
 * 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * numbers는 소문자로만 구성되어 있습니다.
 * numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
 * 1 ≤ numbers의 길이 ≤ 50
 * "zero"는 numbers의 맨 앞에 올 수 없습니다.
 *
 * 입출력 예
 * numbers	result
 * "onetwothreefourfivesixseveneightnine"	123456789
 * "onefourzerosixseven"	14067
 */
public class 영어가_싫어요 {
    public static void main(String[] args) {
        // String numbers = "onetwothreefourfivesixseveneightnine";
        String numbers = "onefourzerosixseven";

        long solution = solution(numbers);

        System.out.println("solution = " + solution);
    }

    // 해쉬맵에 문자열 숫자를 넣어둠.
    // StringBuilder로 문자 하나씩 넣어서 문자열 만듦.
    // 문자 하나씩 넣을 때마다 해쉬맵에서 체크
    // 만약 있으면 정답 문자열에 붙여 넣음
    public static long solution(String numbers) {
        StringBuilder answerStr = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();

        Map<String, String> map = new HashMap<>();

        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        for(char ch: numbers.toCharArray()) {
            tempStr.append(ch);

            if(map.get(tempStr.toString()) != null) {
                answerStr.append(map.get(tempStr.toString()));
                tempStr.setLength(0);
            }
        }
        
        return Long.parseLong(answerStr.toString());
    }
}
