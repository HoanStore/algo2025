package com.hoan.algo2025.programmers.step0;

/**
 * 문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
 */
public class 문자열이_몇_번_등장하는지_세기 {
    public static void main(String[] args) {
//        String myString = "banana";
//        String pat = "ana";

        String myString = "aaaa";
        String pat = "aa";

        int solution = solution(myString, pat);

        System.out.println("solution = " + solution);
    }

    public static int solution(String myString, String pat) {
        int answer = 0;

        int index = myString.indexOf(pat);

        if(index != -1) {
            answer = 1;
        }

        while (index != -1) {
            index = myString.indexOf(pat, index + 1);
            answer++;
        }

        return answer;
    }
}
