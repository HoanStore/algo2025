package com.hoan.algo2025.programmers.step0;

import java.util.ArrayList;
import java.util.List;

/**
 * 문자열 myString과 pat가 주어집니다.
 * myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
 *
 * 5 ≤ myString ≤ 20
 * 1 ≤ pat ≤ 5
 * pat은 반드시 myString의 부분 문자열로 주어집니다.
 * myString과 pat에 등장하는 알파벳은 대문자와 소문자를 구분합니다.
 *
 *
 * myString	pat	result
 * "AbCdEFG"	"dE"	"AbCdE"
 * "AAAAaaaa"	"a"	"AAAAaaaa"
 */
public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {

    public static void main(String[] args) {
        String myString = "AbCdEFG";
        String pat = "dE";

        String solution = solution(myString, pat);

        System.out.println("solution = " + solution);
    }

    public static String solution(String myString, String pat) {
        int lastIndex = myString.lastIndexOf(pat);
        if (lastIndex == -1) return ""; // pat이 없을 경우 (문제 조건상 없어도 되지만 안전하게 처리)
        return myString.substring(0, lastIndex + pat.length());
    }
}
