package com.hoan.algo2025.programmers.step0;

import java.util.Arrays;

/**
 * 문자열 my_string이 매개변수로 주어집니다.
 * my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
 * my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 1 ≤ my_string의 길이 ≤ 1,000
 * 1 ≤ my_string 안의 자연수 ≤ 1000
 * 연속된 수는 하나의 숫자로 간주합니다.
 * 000123과 같이 0이 선행하는 경우는 없습니다.
 * 문자열에 자연수가 없는 경우 0을 return 해주세요.
 *
 * my_string	result
 * "aAb1B2cC34oOp"	37
 * "1a2b3c4d123Z"	133
 */
public class 숨어있는_숫자의_덧셈_2 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";

        int solution = solution(my_string);
        int otherSolution = otherSolution(my_string);

        System.out.println("solution = " + solution);
        System.out.println("otherSolution = " + otherSolution);
    }

    public static int solution(String my_string) {
        int sum = 0;
        StringBuilder numberBuilder = new StringBuilder();

        for(char ch: my_string.toCharArray()) {
            if(Character.isDigit(ch)) {
                numberBuilder.append(ch);
            } else {
                if(numberBuilder.length() > 0) {
                    sum += Integer.parseInt(numberBuilder.toString());
                    numberBuilder.setLength(0);
                }
            }
        }
        if(numberBuilder.length() > 0) {
            sum += Integer.parseInt(numberBuilder.toString());
        }

        return sum;
    }

    public static int otherSolution(String my_string) {
        int answer = 0;

        String [] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s: str) {
            if(!s.equals("")) {
                answer += Integer.valueOf(s);
            }
        }
        

        return answer;
    }
}
