package com.hoan.algo2025.programmers.step0;

/**
 * 문자열 s가 매개변수로 주어집니다.
 * s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 *
 * 0 < s의 길이 < 1,000
 * s는 소문자로만 이루어져 있습니다.
 *
 *
 * s	result
 * "abcabcadc"	"d"
 * "abdc"	"abcd"
 * "hello"	"eho"
 */
public class 한번만_등장한_문자 {
    public static void main(String[] args) {
//        String s = "abcabcadc";
//        String s = "abdc";
        String s = "hello";

        String solution = solution(s);

        System.out.println("solution = " + solution);

    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int [] alpa = new int[26];

        for(char c: s.toCharArray()) {
            alpa[c - 'a']++;
        }

        for(int i=0; i<26; i++) {
            if(alpa[i] == 1) {
                sb.append(Character.toString(i+'a'));
            }
        }

        return sb.toString();
    }
}
