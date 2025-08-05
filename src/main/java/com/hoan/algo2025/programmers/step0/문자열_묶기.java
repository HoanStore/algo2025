package com.hoan.algo2025.programmers.step0;

/**
 * 문자열 배열 strArr이 주어집니다.
 * strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때
 * 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
 *
 * 1 ≤ strArr의 길이 ≤ 100,000
 * 1 ≤ strArr의 원소의 길이 ≤ 30
 * strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
 *
 * strArr	result
 * ["a","bc","d","efg","hi"]	2
 */
public class 문자열_묶기 {
    public static void main(String[] args) {
        String [] strArr = {"a","bc","d","efg","hi"};

        int solution = solution(strArr);
        System.out.println("solution = " + solution);
    }

    public static int solution(String[] strArr) {
        int answer = -1;

        int [] counts = new int[50];

        for (String str : strArr) {
            counts[str.length()]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if(counts[i] > answer) {
                answer = counts[i];
            }
        }

        return answer;
    }
}
