package com.hoan.algo2025.programmers.step0;

import java.util.ArrayList;
import java.util.List;

/**
 * 문자열 my_str과 n이 매개변수로 주어질 때,
 * my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 1 ≤ my_str의 길이 ≤ 100
 * 1 ≤ n ≤ my_str의 길이
 * my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
 *
 * my_str	n	result
 * "abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
 * "abcdef123"	3	["abc", "def", "123"]
 *
 *
 */
public class 잘라서_배열로_저장하기 {
    public static void main(String[] args) {
//        String my_str = "abc1Addfggg4556b";
//        int n = 6;

        String my_str = "abcdef123";
        int n = 3;

        String[] solution = solution(my_str, n);
        String[] strings = otherSolution(my_str, n);

        for (String s : solution) {
            System.out.println("s = " + s);
        }

        for (String string : strings) {
            System.out.println("string = " + string);
        }

    }

    public static String[] solution(String my_str, int n) {

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<my_str.length(); i++) {
            if((i % n ) == 0 && i != 0) {
                list.add(sb.toString());
                sb.setLength(0);
            }

            if(i == my_str.length() - 1) {
                sb.append(my_str.charAt(i));
                list.add(sb.toString());
            }

            sb.append(my_str.charAt(i));
        }

        return list.toArray(new String[0]);
    }

    public static String[] otherSolution(String my_str, int n) {
        List<String> list = new ArrayList<>();

        for(int i=0; i< my_str.length(); i += n) {
            int end = Math.min(i+n, my_str.length());
            list.add(my_str.substring(i, end));
        }

        return list.toArray(new String[0]);
    }
}
